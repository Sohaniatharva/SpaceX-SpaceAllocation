package com.space.space.controller;

import com.space.space.model.SpaceAllocation;
import com.space.space.service.SpaceAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceAllocationController {

    @Autowired
    private SpaceAllocationService spaceAllocationService;

    @PostMapping("/spaceX/allocateSpace")
    public boolean allocateSpace(@RequestBody SpaceAllocation spaceAllocation){
        return spaceAllocationService.allocateSpace(spaceAllocation);
    }
}
