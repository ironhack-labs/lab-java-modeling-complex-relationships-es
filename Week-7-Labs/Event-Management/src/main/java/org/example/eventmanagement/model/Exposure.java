package org.example.eventmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "exposures")
@Getter
@Setter
public class Exposure extends Event {

}
