package com.ironhack.Lab38.repository.Events;

import com.ironhack.Lab38.model.Events.Exhibition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {
}
