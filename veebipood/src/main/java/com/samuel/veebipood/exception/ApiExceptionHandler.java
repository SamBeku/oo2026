package com.samuel.veebipood.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class ApiExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorMessage> handleException(RuntimeException ex) {
        ErrorMessage errorMessage = new ErrorMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage)
    }
}
