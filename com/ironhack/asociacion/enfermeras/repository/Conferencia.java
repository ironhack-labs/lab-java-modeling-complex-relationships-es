package com.ironhack.asociacion.enfermeras.repository;

import com.ironhack.asociacion.enfermeras.model.Conferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenciaRepository extends JpaRepository<Conferencia, Long> {
}
