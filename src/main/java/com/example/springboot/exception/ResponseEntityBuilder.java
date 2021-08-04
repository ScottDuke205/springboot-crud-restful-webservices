package com.example.springboot.exception;

import org.springframework.http.ResponseEntity;

public class ResponseEntityBuilder {

    public static ResponseEntity<Object> build(ErrorMessage apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}
