package com.example.lota.com.Configuring.Core.Spring.Application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(Exception ex) {
        ex.printStackTrace(); // See full stack trace in console
        return ResponseEntity.status(500).body("Error: " + ex.getMessage());
    }
}
