package com.example.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.eventmanagement.entity.Exhibition;

@Repository
public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {
}

