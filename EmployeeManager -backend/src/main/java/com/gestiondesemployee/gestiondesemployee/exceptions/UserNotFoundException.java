package com.gestiondesemployee.gestiondesemployee.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super (message);
    }
}
