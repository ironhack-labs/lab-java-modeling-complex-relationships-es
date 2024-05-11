package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@DiscriminatorValue("conferences")
public class Conference extends Events{

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;
}
