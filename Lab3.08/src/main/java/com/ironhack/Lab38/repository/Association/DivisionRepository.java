package com.ironhack.Lab38.repository.Association;

import com.ironhack.Lab38.model.Association.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Long> {
}
