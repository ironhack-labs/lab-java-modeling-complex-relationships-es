package org.ironhack.lab308.repository.nurses;

import org.ironhack.lab308.events.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {
}
