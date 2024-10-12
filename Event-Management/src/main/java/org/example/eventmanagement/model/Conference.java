package org.example.eventmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "confereces")
@Getter
@Setter
public class Conference extends Event {
  @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  List<Orator> orators;
}
