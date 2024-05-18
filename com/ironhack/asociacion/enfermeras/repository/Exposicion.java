package com.ironhack.asociacion.enfermeras.repository;

import com.ironhack.asociacion.enfermeras.model.Exposicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExposicionRepository extends JpaRepository<Exposicion, Long> {
}
