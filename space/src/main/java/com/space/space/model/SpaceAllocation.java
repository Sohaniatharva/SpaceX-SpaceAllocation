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
    private DepartmentOECode deptOECode;
    private final Date startDate;
    String seatIdStart;
    String seatIdEnd;
    


}
