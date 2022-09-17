package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
  @Id
  private String seatId;
  private String deptOECode;
  private String teamOECode;
  private int employeeId;
}
