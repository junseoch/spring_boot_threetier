package com.app.threetier.api;

import com.app.threetier.exception.PostException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(PostException.class)
    public void postExceptionHandler(){

    }


}
