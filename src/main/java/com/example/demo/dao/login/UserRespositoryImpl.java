package com.example.demo.dao.login;

import com.example.demo.beans.login.User;
import com.example.demo.error.ESException;
import org.springframework.stereotype.Repository;

@Repository
public class UserRespositoryImpl  implements UserRepository {

    @Override
    public User getServerUser() throws ESException {
        User user = new User("liuqi", "123456");
        if (user.getName() == null){
            throw new ESException(ESException.ERROR_NO_ACCOUNT);
        }
        return user;
    }
}
