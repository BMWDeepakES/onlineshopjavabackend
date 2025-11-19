//package com.ecomadmin.ecommeradmin.exception;
//
//import com.ecomadmin.ecommeradmin.exception.userexception.UserOwnException;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class AdminPortalException {
//
//    @ExceptionHandler(UserOwnException.class)
//    public ResponseEntity<?> UserThrowException(String message) {
//        return ResponseEntity.badRequest().body(message);
//    }//
//}
