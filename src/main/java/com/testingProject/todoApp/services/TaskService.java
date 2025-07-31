package com.testingProject.todoApp.services;

import com.testingProject.todoApp.dto.TaskDto;
import com.testingProject.todoApp.entities.Tasks;
import com.testingProject.todoApp.exceptions.ResourceNotFoundException;
import com.testingProject.todoApp.mappers.TaskMapper;
import com.testingProject.todoApp.repositories.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TasksRepository tasksRepository;

    @Autowired
    private TaskMapper taskMapper;

    public Object createTask(TaskDto task) {
        return tasksRepository.save(taskMapper.mapToEntity(task));
    }

    public Object getTaskById(Long id) {
        Optional<Tasks> idTask = tasksRepository.findById(id);
         return idTask.orElseThrow(()->new ResourceNotFoundException("Task not found"));
    }


    public List<?> getTasksByUser(Long userId) {
        return tasksRepository.findByUserId(userId);
    }

    public Object updateTask(Long id, TaskDto updatedTask) {
        Tasks existingTask = tasksRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found with id: " + id));

        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setStatus(updatedTask.getStatus());
        existingTask.setImportant(updatedTask.isImportant());
        existingTask.setUpdatedAt(LocalDateTime.now());
        existingTask.setDueDate(updatedTask.getDueDate());

        Tasks savedTask = tasksRepository.save(existingTask);
        return savedTask;
    }

    public void deleteTask(Long id) {
    }

    public List<?> getAllTasks() {
        System.out.println("++++++++in getAll Tasks Service Method++====");
        return tasksRepository.findAll();
    }
}
