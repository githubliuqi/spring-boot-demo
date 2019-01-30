package com.example.demo.services.login;


import com.example.demo.beans.login.User;
import com.example.demo.error.ESException;


public interface LoginService {

     boolean verifyUser(User user) throws ESException;
}
