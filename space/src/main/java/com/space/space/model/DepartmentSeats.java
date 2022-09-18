package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentSeats {
    private String departmentOECode;
    private String teamOECode;
    private String designation;
    private List<Seat> seats;
}
