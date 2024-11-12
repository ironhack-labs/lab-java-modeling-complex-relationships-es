package com.example.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.eventmanagement.entity.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
