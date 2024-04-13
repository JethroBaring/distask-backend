package com.jujutsu.distaskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jujutsu.distaskbackend.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
