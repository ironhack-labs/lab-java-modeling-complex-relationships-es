package org.ironhack.lab3_08.exercise2.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("EXPO")
public class Expositions extends Event{
    public Expositions(Integer id, LocalDate date, String duration, String location, String title, List<Guest> guests) {
        super(id, date, duration, location, title, guests);
    }

    public Expositions() {
    }

    public Expositions(LocalDate date, String duration, String location, String title) {
        super(date, duration, location, title);
    }
}
