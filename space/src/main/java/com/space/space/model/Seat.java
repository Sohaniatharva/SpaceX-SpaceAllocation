package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Seat {
  private String seatId;
  private DepartmentOECode deptOECode;
  private TeamOECode teamOECode;
  private int employeeId;
}
