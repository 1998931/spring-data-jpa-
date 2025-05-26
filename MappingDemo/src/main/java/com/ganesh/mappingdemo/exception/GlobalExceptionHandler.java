package com.ganesh.mappingdemo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(UserNotFound.class)
    public ResponseEntity<?> handleUserNotFoundException(UserNotFound ex) {
        return ResponseEntity.status(404).body(ex.getMessage());

    }


}
