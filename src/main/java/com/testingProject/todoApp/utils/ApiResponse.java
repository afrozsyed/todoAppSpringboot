package com.testingProject.todoApp.utils;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ApiResponse<T> {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime timestamp;
    private int status;
    private boolean success;
    private String message;
    private T data;

    public ApiResponse( int status, boolean success, String message, T data) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(){
        this.timestamp = LocalDateTime.now();
    }

    public static <T> ApiResponse<T> success(T data, String message, int statusCode) {
        return new ApiResponse<>(statusCode, true, message, data);
    }

    public static <T> ApiResponse<T> error(String message, int statusCode) {
        return new ApiResponse<>(statusCode, false, message, null);
    }
}

