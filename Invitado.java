package com.ironhack.asociacion.enfermeras.model;

import com.ironhack.asociacion.enfermeras.enums.GuestStatus;

import javax.persistence.*;

@Entity
public class Invitado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;


    public Invitado() {
    }


    public Invitado(String name, GuestStatus status) {
        this.name = name;
        this.status = status;
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

    public GuestStatus getStatus() {
        return status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }
}
