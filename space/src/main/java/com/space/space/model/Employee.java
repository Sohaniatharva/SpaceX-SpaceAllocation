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
public class Employee {
    @Id
    private int employeeId;
    private String employeeName;
    private Employee reportsTo;
    private String designation;
    private String OECode;
    private TeamOECode teamOECode;
    private DepartmentOECode departmentOECode;
    private String password;
}
