package com.example.nursingassociation.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long divisionId;

    private String name;
    private String district;

    @OneToOne
    private Member president;

    @OneToMany
    private List<Member> members;

    public Division() {}

    public Division(String name, String district, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }

    // Getters y setters
}

