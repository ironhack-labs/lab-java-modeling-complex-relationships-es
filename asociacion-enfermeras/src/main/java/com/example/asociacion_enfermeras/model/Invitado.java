package com.example.asociacion_enfermeras.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.ResponseStatus;

@Entity
public class Invitado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)

    private ResponseStatus status;

    public Invitado() {

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
    public ResponseStatus getStatus() {
return status;
    }
    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

}
