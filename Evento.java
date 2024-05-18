package com.ironhack.asociacion.enfermeras.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private int duration;
    private String location;
    private String title;

    @OneToMany
    private List<Invitado> list;


    public Evento() {
    }


    public Evento(Date date, int duration, String location, String title, List<Invitado> list) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.list = list;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Invitado> getList() {
        return list;
    }

    public void setList(List<Invitado> list) {
        this.list = list;
    }
}
