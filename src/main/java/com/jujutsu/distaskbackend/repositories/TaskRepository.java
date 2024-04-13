package com.jujutsu.distaskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jujutsu.distaskbackend.models.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{
    
}
