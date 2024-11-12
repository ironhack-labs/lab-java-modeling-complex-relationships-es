package com.example.nursingassociation.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    @Temporal(TemporalType.DATE)
    private Date renewalDate;

    public Member() {}

    public Member(String name, MemberStatus status, Date renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    // Getters y setters
}
