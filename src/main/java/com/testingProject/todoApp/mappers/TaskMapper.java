package com.testingProject.todoApp.mappers;

import com.testingProject.todoApp.dto.TaskDto;
import com.testingProject.todoApp.entities.Tasks;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {
    public Tasks mapToEntity(TaskDto task) {
        Tasks tasks = new Tasks();
        tasks.setCategoryId(task.getCategoryId());
        tasks.setDescription(task.getDescription());
        tasks.setImportant(task.isImportant());
        tasks.setStatus(task.getStatus());
        tasks.setTitle(task.getTitle());
        tasks.setDueDate(task.getDueDate());
        tasks.setUserId(task.getUserId());
        return tasks;
    }

    public TaskDto mapToDto(Tasks task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setCategoryId(task.getCategoryId());
        taskDto.setDescription(task.getDescription());
        taskDto.setImportant(task.isImportant());
        taskDto.setStatus(task.getStatus());
        taskDto.setTitle(task.getTitle());
        taskDto.setDueDate(task.getDueDate());
        taskDto.setUserId(task.getUserId());
        return taskDto;
    }

}
