package com.spendtracker.spendtracker.models;

import lombok.Data;

@Data
public class ErrorResponseModel {


    private String data;
    private int statusCode;
    
    public ErrorResponseModel(String data) {
        this.data = data;
    }

    public ErrorResponseModel(String data, int statusCode) {
        this.data = data;
        this.statusCode = statusCode;
    }

    
    
}
