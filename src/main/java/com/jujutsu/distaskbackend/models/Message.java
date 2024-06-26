package com.jujutsu.distaskbackend.models;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue
    private int id;
    private String content;

    @ManyToOne
    private User sender;
    private LocalDateTime timestamp;

    @ManyToOne
    private GroupChat groupChat;
}
