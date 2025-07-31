package com.testingProject.todoApp.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {

    private String userName;
    private String email;
    private String password;
}
