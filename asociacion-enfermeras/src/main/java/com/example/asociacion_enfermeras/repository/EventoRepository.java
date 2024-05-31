package com.example.asociacion_enfermeras.repository;

import com.example.asociacion_enfermeras.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
