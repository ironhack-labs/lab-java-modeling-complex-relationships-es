package com.ironhack.asociacion.enfermeras.repository;

import com.ironhack.asociacion.enfermeras.model.Invitado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvitadoRepository extends JpaRepository<Invitado, Long> {
}
