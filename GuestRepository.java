package com.example.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.eventmanagement.entity.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
