package com.space.space.service;

import com.space.space.model.*;
import com.space.space.repository.DepartmentRepo;
import com.space.space.repository.EmployeeRepo;
import com.space.space.repository.SeatRepo;
import com.space.space.repository.SpaceAllocationRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class SpaceAllocationServiceImpl implements SpaceAllocationService{

    @Autowired
    private SpaceAllocationRepo spaceAllocationRepo;
    @Autowired
    private SeatRepo seatRepo;
    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public boolean allocateSpace(SpaceAllocation spaceAllocation) {
       if (spaceAllocationRepo.findByDepartmentOECode(spaceAllocation.getDepartmentOECode())!=null)
       {
            return false;
       }
       else{
           spaceAllocationRepo.save(spaceAllocation);

           String[] seatStartId = spaceAllocation.getSeatIdStart().split("-");
           String[] seatEndId = spaceAllocation.getSeatIdEnd().split("-");
           int startId = Integer.parseInt(seatStartId[2]);
           int endId = Integer.parseInt(seatEndId[2]);
           for (int i = startId;i<= endId; i++) {
               String seatId = seatStartId[0]+"-"+seatStartId[1]+"-"+String.valueOf(i);
               seatRepo.save(new Seat(seatId,null,null,departmentRepo.findByDepartmentOECode(spaceAllocation.getDepartmentOECode())));
           }
       }
        return true;
    }

    @Override
    public DepartmentSeats getAllSeats(int empId) {
        Employee employee = employeeRepo.findByEmployeeId(empId);
        DepartmentSeats departmentSeats = new DepartmentSeats(employee.getDepartment().getDepartmentOECode(),seatRepo.findAll());
        return departmentSeats;
    }
}
