package com.ironhack.javamodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironhack.javamodeling.model.Guest;

/**
 * GuestRepository
 */
public interface GuestRepository extends JpaRepository<Guest, Long>{

    
}
