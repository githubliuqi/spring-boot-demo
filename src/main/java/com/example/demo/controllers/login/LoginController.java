package com.example.demo.controllers.login;

import com.example.demo.beans.login.User;
import com.example.demo.error.ESException;
import com.example.demo.services.login.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

/**
 * @Controller而不是@RestController，不然也会直接返回字段值
 */
@Controller
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;


    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    @PostMapping("/loginVerify")
    public String loginVerify(User user, HttpSession session) {
        User user2 = new User();
        user2.setName(user.getName());
        user2.setPassword(user.getPassword());

        boolean verify = false;
        try {
            verify = loginService.verifyUser(user);
        } catch (ESException e) {
           if (e.code == ESException.ERROR_NO_ACCOUNT){
               return "register";
           }
        }
        System.out.println("loginVerify = "+verify);
        return "login_result";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }


    @RequestMapping("/logout")
    public void logout() {

    }

    @RequestMapping("/user/register")
    public String userRegister(HttpServlet httpServlet) {

        return "";
    }


    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("register");
    }

    public String login(@ModelAttribute User user) {
        String name = user.getName();
        String password = user.getPassword();

        if (name.equals("liuqi") && password.equals("123456")) {
            return "success";
        }

        return "failed";
    }
}
