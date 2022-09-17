package com.space.space.model;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    private String DepartmentOECode;
    private String name;
    private int VPEmpId;

}
