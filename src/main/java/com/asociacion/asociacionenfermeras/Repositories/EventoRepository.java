package com.asociacion.asociacionenfermeras.Repositories;

import com.asociacion.asociacionenfermeras.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}