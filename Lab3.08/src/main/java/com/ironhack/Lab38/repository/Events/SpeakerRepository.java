package com.ironhack.Lab38.repository.Events;

import com.ironhack.Lab38.model.Events.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
