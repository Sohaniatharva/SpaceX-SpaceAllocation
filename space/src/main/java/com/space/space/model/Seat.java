package com.space.space.model;

import lombok.Data;

@Data

public class Seat {
  public String seatId;
  DepartmentOECode DeptOECode;
  TeamOECode teamOECode;
  int EmployeeId;
}
