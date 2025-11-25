package com.ecomadmin.ecommeradmin.service.impl;

import com.ecomadmin.ecommeradmin.entity.Users;
import com.ecomadmin.ecommeradmin.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.AssertionErrors;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    private Users user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        user = new Users(1, "John", "Doe", "Admin", LocalDateTime.now(), LocalDateTime.now(), "john.doe@example.com", "password123");
    }

    @Test
    void testSaveOrUpdateUser() {
        Mockito.when(userRepository.saveAndFlush(user)).thenReturn(user);

        Users savedUser = userServiceImpl.saveOrUpdateUser(user);

//        AssertionErrors.assertNotNull(savedUser);
        Assertions.assertEquals(user.getUserId(), savedUser.getUserId());
    }

    @Test
    void testGetAllUsersList() {
        List<Users> usersList = Arrays.asList(user, new Users(2, "Jane", "Doe", "User", LocalDateTime.now(), LocalDateTime.now(), "jane.doe@example.com", "password456"));
        Mockito.when(userRepository.findAll()).thenReturn(usersList);

        List<Users> result = userServiceImpl.getAllUsersList();

//        AssertionErrors.assertNotNull(result);
        Assertions.assertEquals(2, result.size());
//        Mockito.verify(userRepository,
//                times(1)).findAll();
    }

    @Test
    void testGetUser() {
        Mockito.when(userRepository.findById(1)).thenReturn(Optional.of(user));

        Users result = userServiceImpl.getUser(1);

//        AssertionErrors.assertNotNull(result);
        Assertions.assertEquals(user.getUserId(), result.getUserId());
//        Mockito.verify(userRepository, times(1)).findById(1);
    }
}