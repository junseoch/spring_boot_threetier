package com.app.threetier.api;

import com.app.threetier.domain.dto.ApiResponseDTO;
import com.app.threetier.exception.PostException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PostCustomExceptionHandler {

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ApiResponseDTO> PostexceptionHandler(PostException e) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        if(e instanceof PostException){
            httpStatus = HttpStatus.BAD_REQUEST;
        } else if (e instanceof PostException){
            httpStatus = HttpStatus.NOT_FOUND;
        }
        return ResponseEntity.status(httpStatus).body(ApiResponseDTO.of(e.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ApiResponseDTO> ExceptionHandler(Exception e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ApiResponseDTO.of("잘못된 요청입니다"));
    }



}
