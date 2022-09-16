package com.space.space.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    int employee_id;
    String employee_code;
    String employee_name;
    List<Seat> seats;
    EmployeeType type;
}
