package com.app.threetier.api;

import com.app.threetier.domain.dto.ApiResponseDTO;
import com.app.threetier.exception.MemberException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MemberCustomExceptionHandler {

    @ExceptionHandler(MemberException.class)
    protected ResponseEntity<ApiResponseDTO> memberExceptionHandler(MemberException e) {

        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        if(e instanceof MemberException){
            httpStatus = HttpStatus.BAD_REQUEST;
        } else if (e instanceof MemberException) {
            httpStatus = HttpStatus.UNAUTHORIZED;
        }
        return ResponseEntity.status(httpStatus).body(ApiResponseDTO.of(e.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ApiResponseDTO> exceptionHandler(Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ApiResponseDTO.of("잘못된 요청입니다"));
    }

}
