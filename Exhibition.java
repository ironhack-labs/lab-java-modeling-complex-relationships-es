package com.example.eventmanagement.entity;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class Exhibition extends Event {
    public Exhibition() {}

    public Exhibition(Date date, Integer duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }
}


