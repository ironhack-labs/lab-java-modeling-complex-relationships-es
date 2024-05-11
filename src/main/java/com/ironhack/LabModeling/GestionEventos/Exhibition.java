package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Exhibition")
public class Exhibition extends Events{
}

