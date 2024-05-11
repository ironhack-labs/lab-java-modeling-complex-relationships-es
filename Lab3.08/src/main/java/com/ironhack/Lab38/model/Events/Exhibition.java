package com.ironhack.Lab38.model.Events;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "exhibitions")
public class Exhibition extends Event {
    public Exhibition(Date date, Integer duration, String location, String title, List<Guests> guests) {
        super(date, duration, location, title, guests);
    }

    public Exhibition() {
    }
}
