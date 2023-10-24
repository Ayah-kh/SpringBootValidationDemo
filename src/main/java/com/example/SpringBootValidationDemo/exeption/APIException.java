package com.example.SpringBootValidationDemo.exeption;

public class APIException extends RuntimeException {


    public APIException(String message) {
        super(message);
    }
}
