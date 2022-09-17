package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public
class Team {

    @Id
    private String teamOECode;
    private String teamName;
    private int AVPEmpId;
    private String DepartmentOECode;
}
