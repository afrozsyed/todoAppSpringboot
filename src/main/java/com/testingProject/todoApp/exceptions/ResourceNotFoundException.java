package com.testingProject.todoApp.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{
    private String message;

    public ResourceNotFoundException(){
    }

    public ResourceNotFoundException(String msg){
        this.message = msg;
    }
}
