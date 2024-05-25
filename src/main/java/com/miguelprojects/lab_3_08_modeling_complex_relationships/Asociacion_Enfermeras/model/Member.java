package com.miguelprojects.lab_3_08_modeling_complex_relationships.Asociacion_Enfermeras.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "renewal_date")
    private LocalDate renewalDate;

    @ManyToOne
    @JoinColumn(name = "division", referencedColumnName = "division_id")
    private Division division;

    public Member() {    }

    public Member(Long memberId, String name, Status status, LocalDate renewalDate, Division division) {
        this.memberId = memberId;
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
        this.division = division;
    }

    public Long getMemberId() {
        return memberId;
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

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
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
