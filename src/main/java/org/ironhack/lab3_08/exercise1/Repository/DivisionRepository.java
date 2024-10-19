package org.ironhack.lab3_08.exercise1.Repository;

import org.ironhack.lab3_08.exercise1.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository  extends JpaRepository<Division, Integer> {
}
