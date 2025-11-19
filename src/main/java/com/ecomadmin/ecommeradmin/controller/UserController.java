package com.ecomadmin.ecommeradmin.controller;

import com.ecomadmin.ecommeradmin.entity.Users;
import com.ecomadmin.ecommeradmin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@Slf4j
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public ResponseEntity<Users> saveUser(@RequestBody Users user) {
        Users userResponse= userService.saveOrUpdateUser(user);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<Users>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsersList(),HttpStatus.OK);
    }

    @GetMapping("/getUser")
    public Users getUsers(@RequestParam("id") int id) {
        return userService.getUser(id);
    }
}
