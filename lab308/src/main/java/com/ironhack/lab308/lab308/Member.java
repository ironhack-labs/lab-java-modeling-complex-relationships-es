package com.ironhack.lab308.lab308;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus; // status property

    @Temporal(TemporalType.DATE)
    private Date renewalDate;

    // getters setters
}
