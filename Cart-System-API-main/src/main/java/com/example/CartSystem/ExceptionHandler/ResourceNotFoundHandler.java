package com.example.CartSystem.ExceptionHandler;

import com.example.CartSystem.CustomException.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ResourceNotFoundHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> resourceNotFound(ResourceNotFoundException exc, WebRequest request){
        return new ResponseEntity<String>(exc.getMessage(), HttpStatus.NOT_FOUND);
    }
}
