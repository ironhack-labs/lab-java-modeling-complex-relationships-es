package org.ironhack.lab3_08.exercise2.Repository;

import org.ironhack.lab3_08.exercise2.model.Expositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpositionsRepository extends JpaRepository<Expositions, Integer> {
}
