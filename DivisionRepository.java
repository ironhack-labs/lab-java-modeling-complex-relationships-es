package com.example.nursingassociation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nursingassociation.entity.Division;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Long> {
}

