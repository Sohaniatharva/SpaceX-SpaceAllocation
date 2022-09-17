package com.space.space.model;

import javax.persistence.*;

@Entity
public class Team {

    @Id
    private String TeamOECode;
    private String teamName;
    private int AVPEmpId;
    private String DepartmentOECode;
}
