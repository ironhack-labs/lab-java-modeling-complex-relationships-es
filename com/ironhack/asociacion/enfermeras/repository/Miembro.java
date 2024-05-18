package com.ironhack.asociacion.enfermeras.repository;

import com.ironhack.asociacion.enfermeras.model.Miembro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiembroRepository extends JpaRepository<Miembro, Long> {
}