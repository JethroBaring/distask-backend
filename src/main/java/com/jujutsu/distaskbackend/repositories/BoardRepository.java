package com.jujutsu.distaskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jujutsu.distaskbackend.models.Board;

public interface BoardRepository extends JpaRepository <Board, Integer>{
    
}
