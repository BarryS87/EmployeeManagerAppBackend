package com.barry.employeemanager.exceptions;

//custom user not founc exception
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
