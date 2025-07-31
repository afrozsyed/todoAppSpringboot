package com.testingProject.todoApp.controllers;

import com.testingProject.todoApp.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto){
        return ResponseEntity.ok("working now");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUsers(@PathVariable Long id){
        return ResponseEntity.ok("working now");
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers(){
        return ResponseEntity.ok("working now");
    }
}
