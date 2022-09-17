package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
  @Id
  private String seatId;

//  @OneToOne(mappedBy = "seat")
//  private Employee employee;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "team_OE_code")
  private Team team;


  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "department_OE_code")
  private Department department;
}
