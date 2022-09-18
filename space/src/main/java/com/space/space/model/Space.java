package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Space {
    private String eDate;
    private int empId;
    private int floor;
    private int numberOfSeats;
    private String sDate;
}
