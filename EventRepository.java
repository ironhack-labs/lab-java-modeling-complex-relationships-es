package com.example.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.eventmanagement.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}

