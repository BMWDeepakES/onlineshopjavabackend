package com.ecomadmin.ecommeradmin.service;

import com.ecomadmin.ecommeradmin.entity.Users;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    Users saveOrUpdateUser(Users user);
    List<Users> getAllUsersList();

    Users getUser(int id);
}
