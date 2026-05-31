package com.Product.caresale.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String , Object>> handleNotFoundException(ResourceNotFoundException ex ) {
        Map<String , Object>  error = new HashMap<>();
        error.put("status", 404);
        error.put("massage", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(error);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String , Object>>
            handleValidation(MethodArgumentNotValidException ex ) {
        Map<String , Object>  errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach( error -> errors.put(
                        error.getField(),
                        error.getDefaultMessage()));
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errors);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>>
            handleGeneral(Exception ex) {
        Map<String, Object > error = new HashMap<>();
        error.put("status", 500);
        error.put("message", "Something went wrong");
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(error);
    }
}
