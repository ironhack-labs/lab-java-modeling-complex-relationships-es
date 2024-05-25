package com.ironhack.javamodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironhack.javamodeling.model.Event;


/**
 * EventRepository
 */
public interface EventRepository extends JpaRepository<Event, Long>{

    
}
