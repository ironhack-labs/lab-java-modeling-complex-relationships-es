package com.ironhack.asociacion.enfermeras.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    private Miembro president;

    @OneToMany
    private List<Miembro> list;

    // Constructor vacío
    public Division() {
    }


    public Division(String name, String district, Miembro president, List<Miembro> list) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.list = list;
    }


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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Miembro getPresident() {
        return president;
    }

    public void setPresident(Miembro president) {
        this.president = president;
    }

    public List<Miembro> getList() {
        return list;
    }

    public void setList(List<Miembro> list) {
        this.list = list;
    }
}
