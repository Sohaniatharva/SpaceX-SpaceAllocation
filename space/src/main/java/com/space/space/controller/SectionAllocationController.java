package com.space.space.controller;

import com.space.space.model.Seat;
import com.space.space.model.SectionAllocation;
import com.space.space.service.SectionAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SectionAllocationController {
    @Autowired
    private SectionAllocationService sectionAllocationService;

    @PostMapping("/spaceX/allocateSection")
    public boolean allocateSection(@RequestBody SectionAllocation sectionAllocation) {
        return sectionAllocationService.allocateSection(sectionAllocation);
    }
}
