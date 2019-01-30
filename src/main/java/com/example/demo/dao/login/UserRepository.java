package com.example.demo.dao.login;


import com.example.demo.beans.login.User;
import com.example.demo.error.ESException;


public interface UserRepository {


     User getServerUser() throws ESException;
}
