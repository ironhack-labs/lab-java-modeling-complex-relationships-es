package org.example.week7labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "divisions")
@Getter
@Setter
public class Division {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "division_id")
  private Long id;
  @Column(name = "division_name")
  private String name;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "president_id")
  private Member president;
  @Column(name = "division_district")
  private String district;
  @OneToMany( mappedBy = "division" ,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private List<Member> members;
}
