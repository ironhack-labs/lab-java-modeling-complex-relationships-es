package com.ironhack.lab308.lab308;

import jakarta.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getStatus() {
        return status;
    }


    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public Guest(Event event) {
        this.event = event;
    }

    // getters setters
}
