package com.ironhack.lab308.lab308;

import jakarta.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
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
