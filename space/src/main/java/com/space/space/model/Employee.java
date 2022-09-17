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
    private String reportsTo;
    private String designation;
    private String OeCode;
    private String teamOeCode;
    private String departmentOeCode;
    private String password;
}
