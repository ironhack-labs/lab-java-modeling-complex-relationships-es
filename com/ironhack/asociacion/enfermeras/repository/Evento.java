package com.ironhack.asociacion.enfermeras.repository;

import com.ironhack.asociacion.enfermeras.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
}
