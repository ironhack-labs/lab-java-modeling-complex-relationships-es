package com.ironhack.lab_308.lab_3_08.gestion_eventos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "expositions")

public class Exposition extends Event{
    public Exposition(Integer eventId, Date date, Integer duration, String location, String title, List<Guest> guests) {
        super(eventId, date, duration, location, title, guests);
    }

    public Exposition(){}

    public Exposition(Date date, Integer duration, String location, String title) {
        super(date, duration, location, title);
    }
}
