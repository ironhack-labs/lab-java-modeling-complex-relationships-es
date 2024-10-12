package org.example.eventmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orators")
@Getter
@Setter
public class Orator {

  @Id
  private Long id;
  private String name;
  private String duration;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "conference_id")
  Conference conference;

}
