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
    public DepartmentSeats allocateSpace(Space space) {
        String deptOECode = employeeRepo.findByEmployeeId(space.getEmpId()).getDepartment().getDepartmentOECode();
        SpaceAllocation spaceAllocation = spaceAllocationRepo.findByDepartmentOECode(deptOECode);
       if (spaceAllocation!=null)
       {
            return null;
       }
       else{
           String startSeat = spaceAllocationRepo.getStartSeat(space.getFloor());
           String[] seatStartId = startSeat.split("-");
           String[] wings = {"A","B","C","D"};
           int j = 0;
           int seatNumber = Integer.parseInt(seatStartId[2]);
           if (seatStartId[1]=="A"){j=0;}
           else if (seatStartId[1]=="B"){j=1;}
           else if (seatStartId[1]=="C"){j=2;}
           else{j=3;}
           int numberOfSeats = space.getNumberOfSeats();
           //finding start and end seats
           while(numberOfSeats>0){
               if (seatNumber>40){
                   seatNumber=1;
                   j++;
                   continue;
               }
               else{
                   String seatId = "L"+String.valueOf(space.getFloor())+"-"+wings[j]+"-"+String.valueOf(seatNumber);
                   seatRepo.save(new Seat(seatId, space.getFloor(), null,null,departmentRepo.findByDepartmentOECode(deptOECode)));
                   seatNumber++;
               }
                             numberOfSeats--;
           }
           String endSeat = "L"+String.valueOf(space.getFloor())+"-"+wings[j]+"-"+String.valueOf(seatNumber);
           spaceAllocation = new SpaceAllocation(10,deptOECode,space.getSDate(),space.getEDate(),startSeat,endSeat);
           spaceAllocationRepo.save(spaceAllocation);
       }
        Employee employee = employeeRepo.findByEmployeeId(space.getEmpId());
        DepartmentSeats departmentSeats = new DepartmentSeats(employee.getDepartment().getDepartmentOECode(),employee.getTeam().getTeamOECode(),employee.getDesignation(),seatRepo.findAll());

        return departmentSeats;
    }

    @Override
    public DepartmentSeats getAllSeats(int empId) {
        Employee employee = employeeRepo.findByEmployeeId(empId);
        DepartmentSeats departmentSeats = new DepartmentSeats(employee.getDepartment().getDepartmentOECode(),employee.getTeam().getTeamOECode(),employee.getDesignation(),seatRepo.findAll());
        return departmentSeats;
    }
}
