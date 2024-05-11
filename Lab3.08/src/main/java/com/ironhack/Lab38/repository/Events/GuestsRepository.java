package com.ironhack.Lab38.repository.Events;

import com.ironhack.Lab38.model.Events.Guests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestsRepository extends JpaRepository<Guests, Long> {
}
