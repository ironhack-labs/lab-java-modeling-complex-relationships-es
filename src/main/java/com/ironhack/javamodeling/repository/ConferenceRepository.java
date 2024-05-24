package com.ironhack.javamodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironhack.javamodeling.model.Division;

/**
 * ConferenceRepository
 */
public interface ConferenceRepository extends JpaRepository<Division, Long>{
    
}
