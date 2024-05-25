package com.miguelprojects.lab_3_08_modeling_complex_relationships.Asociacion_Enfermeras.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "divisions")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Long divisionId;

    private String name;

    private String district;

    @OneToOne
    @JoinColumn(name = "president", referencedColumnName = "member_id")
    private Member president;

    @OneToMany(mappedBy = "division")
    private List<Member> members;


    public Division() {    }

    public Division(Long divisionId, String name, String district, Member president, List<Member> members) {
        this.divisionId = divisionId;
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }

    public Long getDivisionId() {
        return divisionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Division division = (Division) o;
        return Objects.equals(divisionId, division.divisionId) && Objects.equals(name, division.name) && Objects.equals(district, division.district) && Objects.equals(president, division.president) && Objects.equals(members, division.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(divisionId, name, district, president, members);
    }
}
