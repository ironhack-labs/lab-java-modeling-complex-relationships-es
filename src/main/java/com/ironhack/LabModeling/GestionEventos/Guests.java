package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.*;

@Entity
public class Guests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Enumerated
    private GuestsStatus status;

    @ManyToOne
    @JoinColumn(name = "events_id")
    private Events events;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestsStatus getStatus() {
        return status;
    }

    public void setStatus(GuestsStatus status) {
        this.status = status;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }
}
