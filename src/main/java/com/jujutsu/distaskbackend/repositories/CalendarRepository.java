package com.jujutsu.distaskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jujutsu.distaskbackend.models.Calendar;

public interface CalendarRepository extends JpaRepository<Calendar, Integer> {

}
