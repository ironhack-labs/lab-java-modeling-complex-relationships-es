package org.example.week7labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "members")
@Getter
@Setter
public class Member {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_id")
  private Long id;
  @Column(name = "member_name")
  private String name;
  @Column(name = "member_status")
  private String status;
  @Column(name = "member_renewal_date")
  private String renewalDate;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "division_id")
  private Division division;
}
