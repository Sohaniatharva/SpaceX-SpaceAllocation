package com.space.space.service;

import com.space.space.model.Department;
import com.space.space.model.Seat;
import com.space.space.model.SpaceAllocation;
import com.space.space.repository.DepartmentRepo;
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


    @Override
    public boolean allocateSpace(SpaceAllocation spaceAllocation) {
       if (spaceAllocationRepo.findByDepartmentOECode(spaceAllocation.getDepartmentOECode())!=null)
       {
            return false;
       }
       else{
           spaceAllocationRepo.save(new SpaceAllocation(10,spaceAllocation.getDepartmentOECode(),spaceAllocation.getStartDate(),spaceAllocation.getEndDate(),spaceAllocation.getSeatIdStart(),spaceAllocation.getSeatIdEnd()));

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
}
