package com.jujutsu.distaskbackend.models;

import lombok.NoArgsConstructor;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "creator")
    private List<GroupChat> groupChats;

    @OneToOne(cascade = CascadeType.ALL)
    private UserProfile userProfile;

    @OneToMany(mappedBy = "creator", cascade = CascadeType.ALL)
    private List<Task> createdTasks;

    @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL)
    private List<Task> assignedTasks;
}
