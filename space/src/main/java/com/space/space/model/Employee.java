package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private int employeeId;
    private String employeeName;
    private int reportsTo;
    private String designation;
    private String OECode;

//    private TeamOECode teamOECode;
//    private DepartmentOECode departmentOECode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamOECode", referencedColumnName = "teamOECode")
    private Team team;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentOECode", referencedColumnName = "departmentOECode")
    private Department department;

    private String password;
}
