package com.space.space.service;

import com.space.space.model.DepartmentSeats;
import com.space.space.model.Space;

public interface SpaceAllocationService {
    DepartmentSeats allocateSpace(Space space);
    DepartmentSeats getAllSeats(int empId);
}
