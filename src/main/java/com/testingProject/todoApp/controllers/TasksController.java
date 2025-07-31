package com.testingProject.todoApp.controllers;

import com.testingProject.todoApp.dto.TaskDto;
import com.testingProject.todoApp.entities.Tasks;
import com.testingProject.todoApp.services.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tasks")
@RequiredArgsConstructor
public class TasksController {

    private final TaskService taskService;

    @PostMapping("/add")
    public ResponseEntity<?> createTask(@Valid @RequestBody TaskDto task) {
        System.out.println("Request Body::"+task);
        return ResponseEntity.ok(taskService.createTask(task));
    }

    @GetMapping("/All")
    public ResponseEntity<List<?>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTask(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<?>> getTasksByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(taskService.getTasksByUser(userId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody TaskDto updatedTask) {
        return ResponseEntity.ok(taskService.updateTask(id, updatedTask));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
