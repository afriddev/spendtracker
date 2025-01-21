package com.spendtracker.spendtracker;

import com.spendtracker.spendtracker.models.ErrorResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
     @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorResponseModel> handleServerError(Exception ex) {
        
        ErrorResponseModel model = new ErrorResponseModel("Something went wrong! Please try again later.");
        return new ResponseEntity<>(model, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
