package com.ironhack.javamodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironhack.javamodeling.model.Speaker;

/**
 * SpeakerRepository
 */
public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

    
}
