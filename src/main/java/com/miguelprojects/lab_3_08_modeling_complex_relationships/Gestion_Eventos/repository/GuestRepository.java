package com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.repository;

import com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
