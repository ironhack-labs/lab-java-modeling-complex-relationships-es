package com.example.nurseassociation.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    private LocalDate renewalDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public enum Status {
        ACTIVE, LAPSED
    }

    // Getters y Setters
}
