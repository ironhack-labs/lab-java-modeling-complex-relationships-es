package com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.repository;

import com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.model.Exposition;
import com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpositionRepository extends JpaRepository<Exposition, Long> {
}
