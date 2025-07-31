package com.testingProject.todoApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Long userId;
    private Long categoryId;
    private String status;
    private String title;
    private String description;
    private boolean isImportant;
    private LocalDate dueDate;
    private LocalDateTime createdAt =LocalDateTime.now();
    private LocalDateTime updatedAt;
}
