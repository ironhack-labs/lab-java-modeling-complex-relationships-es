package org.ironhack.lab3_08.exercise2.Repository;

import org.ironhack.lab3_08.exercise2.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
