package com.testingProject.todoApp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Component
public class TaskDto {

    @NotNull(message = "UserId  is required")
    private Long userId;

    @NotNull(message = "CategoryId is required")
    private Long categoryId;

    private String status;

    @NotEmpty(message = "Title is required")
    private String title;

    @NotEmpty(message = "Description is required")
    private String description;

    private boolean isImportant;

    @NotNull(message = "Due date is required")
    private LocalDate dueDate;
}
