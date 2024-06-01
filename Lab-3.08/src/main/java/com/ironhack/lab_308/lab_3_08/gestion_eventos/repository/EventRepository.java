package com.ironhack.lab_308.lab_3_08.gestion_eventos.repository;

import com.ironhack.lab_308.lab_3_08.gestion_eventos.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Integer> {
}
