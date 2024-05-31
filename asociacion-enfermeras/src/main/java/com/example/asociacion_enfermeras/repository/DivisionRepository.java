package com.example.asociacion_enfermeras.repository;

import com.example.asociacion_enfermeras.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DivisionRepository extends JpaRepository<Division, Long> {}

