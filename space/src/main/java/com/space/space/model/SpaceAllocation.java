package com.space.space.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceAllocation {
    private int allocationId;
    private String deptOECode;
    private Date startDate;
    private String seatIdStart;
    private String seatIdEnd;
}
