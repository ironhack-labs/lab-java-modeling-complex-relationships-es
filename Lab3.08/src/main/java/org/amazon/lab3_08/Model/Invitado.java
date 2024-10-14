package org.amazon.lab3_08.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Invitado {

    @Id
    private Integer id;
    private String name;
    @Enumerated
    private Status status;
    @ManyToMany
    @JoinTable(
            name = "guest_event",
            joinColumns = {@JoinColumn(name = "guest_id")},
            inverseJoinColumns = {@JoinColumn(name = "event_id")}
    )
    private List<Evento> evento;


    public Invitado(Integer id, String name, Status status, List<Evento> events) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.evento = evento;
    }

    public Invitado(Integer id) {
        this.id = id;
    }

    public Invitado(String name, Status status, List<Evento> events) {
        this.name = name;
        this.status = status;
        this.evento = events;
    }

    public Invitado(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public Invitado() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Evento> getEvents() {
        return evento;
    }

    public void setEvents(List<Evento> events) {
        this.evento = events;
    }
}
