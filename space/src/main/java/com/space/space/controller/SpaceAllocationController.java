package com.space.space.controller;

import com.space.space.model.SpaceAllocation;
import com.space.space.service.SpaceAllocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
public class SpaceAllocationController {

    @Autowired
    private SpaceAllocationService spaceAllocationService;

    @PostMapping("/spaceX/allocateSpace")
    public boolean allocateSpace(@RequestBody SpaceAllocation spaceAllocation){
        return spaceAllocationService.allocateSpace(spaceAllocation);
    }
}
