package com.testingProject.todoApp.repositories;

import com.testingProject.todoApp.entities.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepository extends JpaRepository<Tasks,Long> {
    List<Tasks> findByUserId(Long userId);
}
