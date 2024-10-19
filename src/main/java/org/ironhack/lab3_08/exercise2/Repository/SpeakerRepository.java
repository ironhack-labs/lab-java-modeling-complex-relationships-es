package org.ironhack.lab3_08.exercise2.Repository;

import org.ironhack.lab3_08.exercise2.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {
}
