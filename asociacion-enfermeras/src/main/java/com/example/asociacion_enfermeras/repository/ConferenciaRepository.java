package com.example.asociacion_enfermeras.repository;

import com.example.asociacion_enfermeras.model.Conferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ConferenciaRepository extends JpaRepository<Conferencia, Long> {
}
