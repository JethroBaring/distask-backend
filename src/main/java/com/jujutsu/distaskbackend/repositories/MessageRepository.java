package com.jujutsu.distaskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jujutsu.distaskbackend.models.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    
}
