package org.ironhack.lab3_08.exercise2.Repository;

import org.ironhack.lab3_08.exercise2.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
