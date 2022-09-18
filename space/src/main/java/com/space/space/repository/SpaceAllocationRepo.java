package com.space.space.repository;

import com.space.space.model.SpaceAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface SpaceAllocationRepo extends JpaRepository<SpaceAllocation,Integer> {

    SpaceAllocation findByDepartmentOECode(String departmentOECode);

    
}
