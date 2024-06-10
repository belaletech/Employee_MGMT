package com.belaletech.FullStackbackend.exception;

import com.belaletech.FullStackbackend.model.User;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id)
    {
        super("Could not found the user with id "+id);
    }
}
