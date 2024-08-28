package com.learn.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    // Default constructor with a generic error message
    public ResourceNotFoundException() {
        super("Resource not found on server!!");
    }

    // Constructor that accepts a custom error message
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
