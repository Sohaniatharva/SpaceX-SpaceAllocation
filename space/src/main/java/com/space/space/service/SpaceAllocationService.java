package com.space.space.service;

import com.space.space.model.SpaceAllocation;

import java.util.Date;

public interface SpaceAllocationService {
    boolean allocateSpace(SpaceAllocation spaceAllocation);
}