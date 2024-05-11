package com.ironhack.lab308.lab308;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Division {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @ManyToOne
    @JoinColumn(name = "president_id")
    private Member president; // Representing the president as a Member object

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Member> members;


}
