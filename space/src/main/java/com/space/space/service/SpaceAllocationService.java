package com.space.space.service;

import com.space.space.model.DepartmentSeats;
import com.space.space.model.Space;
import com.space.space.model.SpaceAllocation;

import java.util.Date;

public interface SpaceAllocationService {
    boolean allocateSpace(Space space);
    DepartmentSeats getAllSeats(int empId);
}
