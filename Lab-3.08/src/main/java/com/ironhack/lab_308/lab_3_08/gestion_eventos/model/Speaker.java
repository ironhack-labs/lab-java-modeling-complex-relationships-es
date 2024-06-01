package com.ironhack.lab_308.lab_3_08.gestion_eventos.model;

import com.ironhack.lab_308.lab_3_08.gestion_eventos.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "speakers")
public class Speaker extends Guest{
    private Integer presentationDuration;

    public Speaker(String name, Status status, Integer presentationDuration) {
        super(name, status);
        this.presentationDuration = presentationDuration;
    }

    public Speaker(){}

    public Integer getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Integer presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
