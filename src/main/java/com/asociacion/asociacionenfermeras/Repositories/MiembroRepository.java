package com.asociacion.asociacionenfermeras.Repositories;

import com.asociacion.asociacionenfermeras.model.Miembro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MiembroRepository extends JpaRepository<Miembro, Long> {
}