package com.space.space.controller;

import com.space.space.model.Seat;
import com.space.space.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeatController {
    @Autowired
    private SeatService seatService;

    @PostMapping("/seat")
    public Seat addSeat(@RequestBody Seat seat) {
        return seatService.addSeat(seat);
    }

    @GetMapping("/seats")
    public List<Seat> getAllSeats() {
        return seatService.getAllSeats();
    }

    @GetMapping("/getSeatById/{id}")
    public Seat getSeatById(@PathVariable String id) {
        return seatService.getSeatById(id);
    }

    @DeleteMapping("/deleteSeatById/{id}")
    public boolean deleteSeatById(@PathVariable String id) {
        return seatService.deleteSeat(id);
    }

    @PutMapping("/seat")
    public Seat updateSeat(@RequestBody Seat seat) {
        return seatService.updateSeat(seat);
    }
}
