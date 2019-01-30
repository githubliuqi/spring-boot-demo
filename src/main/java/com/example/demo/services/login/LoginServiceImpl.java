package com.example.demo.services.login;

import com.example.demo.beans.login.User;
import com.example.demo.dao.login.UserRespositoryImpl;
import com.example.demo.error.ESException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRespositoryImpl userRepository;

    @Override
    public boolean verifyUser(User user) throws ESException {
        User serverUser = userRepository.getServerUser();
        if (serverUser.getName().equals(user.getName()) && serverUser.getPassword().equals(user.getPassword())){
            return true;
        }
        return false;
    }
}
