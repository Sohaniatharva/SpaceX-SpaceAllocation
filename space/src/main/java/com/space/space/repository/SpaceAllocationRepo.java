package com.space.space.repository;

import com.space.space.model.SpaceAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpaceAllocationRepo extends JpaRepository<SpaceAllocation,Integer> {

    SpaceAllocation findByDepartmentOECode(String departmentOECode);

    @Query(value = "select seat_id from Seat where department_oe_code is null and floor = ?1 order by seat_Id limit 1",nativeQuery = true)
    String getStartSeat(int floor);

}
