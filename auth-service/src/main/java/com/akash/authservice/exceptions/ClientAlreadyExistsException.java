package com.akash.authservice.exceptions;

public class ClientAlreadyExistsException extends Exception{
    public ClientAlreadyExistsException(String message) {
        super(message);
    }
}
