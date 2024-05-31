package com.example.asociacion_enfermeras.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private int duration;
    private String location;
    private String title;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Invitado> list;
    public Evento() {

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;

    }
    public void setDate(LocalDate date) {
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
    public List<Invitado> getList(){
        return list;
    }
    public void setList(List<Invitado>list){
        this.list = list;
    }

}
