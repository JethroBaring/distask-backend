package com.jujutsu.distaskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jujutsu.distaskbackend.models.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer>{
    
}
