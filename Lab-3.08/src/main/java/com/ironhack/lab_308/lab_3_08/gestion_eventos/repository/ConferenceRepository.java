package com.ironhack.lab_308.lab_3_08.gestion_eventos.repository;

import com.ironhack.lab_308.lab_3_08.gestion_eventos.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference,Integer> {
}
