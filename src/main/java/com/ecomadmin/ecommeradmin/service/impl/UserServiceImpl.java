package com.ecomadmin.ecommeradmin.service.impl;

import com.ecomadmin.ecommeradmin.entity.Users;
import com.ecomadmin.ecommeradmin.repository.UserRepository;
import com.ecomadmin.ecommeradmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Users saveOrUpdateUser(Users user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<Users> getAllUsersList() {
        List<Users> uers=new ArrayList<>();

        uers.addAll(userRepository.findAll());
        return uers;
    }

    @Override
    public Users getUser(int id) {
        return userRepository.findById(id).get();
    }
}
