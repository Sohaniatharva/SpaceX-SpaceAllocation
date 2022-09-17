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

    @GetMapping("/getSeatById/{seatId}")
    public Seat getSeatById(@PathVariable String seatId) {
        return seatService.getSeatById(seatId);
    }

    @DeleteMapping("/deleteSeatById/{seatId}")
    public boolean deleteSeatById(@PathVariable String seatId) {
        return seatService.deleteSeat(seatId);
    }

    @PutMapping("/seat")
    public Seat updateSeat(@RequestBody Seat seat) {
        return seatService.updateSeat(seat);
    }
}
