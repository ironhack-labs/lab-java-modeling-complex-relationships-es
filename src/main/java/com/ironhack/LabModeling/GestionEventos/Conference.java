package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("conferences")
public class Conference extends Events{

    @ManyToOne
    @JoinColumn(name = "speakers_id")
    private Speaker speaker;
}
