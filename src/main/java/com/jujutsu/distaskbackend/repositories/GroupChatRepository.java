package com.jujutsu.distaskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jujutsu.distaskbackend.models.GroupChat;

public interface GroupChatRepository extends JpaRepository<GroupChat, Integer>{
    
}
