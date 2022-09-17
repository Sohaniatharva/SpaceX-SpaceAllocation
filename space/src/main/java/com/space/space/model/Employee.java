package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int employeeId;
    private String employeeName;
    private int reportsTo;
    private String designation;
    private String OECode;
    private TeamOECode teamOECode;
    private DepartmentOECode departmentOECode;
    private String password;
}
