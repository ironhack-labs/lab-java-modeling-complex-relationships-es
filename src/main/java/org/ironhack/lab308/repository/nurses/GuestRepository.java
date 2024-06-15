package org.ironhack.lab308.repository.nurses;

import org.ironhack.lab308.events.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {

}
