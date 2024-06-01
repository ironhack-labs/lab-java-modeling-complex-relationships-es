package com.ironhack.lab_308.lab_3_08.enfermeras.model;

import com.ironhack.lab_308.lab_3_08.enfermeras.enums.Status;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Integer memberId;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Date renewalDate;

    @ManyToOne
    @JoinColumn(name = "division", referencedColumnName = "division_id")
    private Division division;

    public Member(){}

    public Member(Integer memberId, String name, Status status, Date renewalDate, Division division) {
        this.memberId = memberId;
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
        this.division = division;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(memberId, member.memberId) && Objects.equals(name, member.name) && status == member.status && Objects.equals(renewalDate, member.renewalDate) && Objects.equals(division, member.division);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, name, status, renewalDate, division);
    }
}
