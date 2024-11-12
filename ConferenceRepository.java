package com.example.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.eventmanagement.entity.Conference;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
