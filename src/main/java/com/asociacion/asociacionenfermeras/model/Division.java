package com.asociacion.asociacionenfermeras.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String district;

    @OneToOne
    private Miembro president;

    @OneToMany(mappedBy = "division")
    private List<Miembro> members;

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = nombre;
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

    public List<Miembro> getMembers() {
        return members;
    }

    public void setMembers(List<Miembro> members) {
        this.members = members;
    }
}
