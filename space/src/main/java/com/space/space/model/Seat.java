package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Seat {
  public String seatId;
  public DepartmentOECode deptOECode;
  public TeamOECode teamOECode;
  public int employeeId;
}
