package com.space.space.service;

import com.space.space.model.Seat;
import com.space.space.repository.SeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatRepo seatRepo;

    public Seat addSeat(Seat seat) {
        return seatRepo.save(seat);
    }

    public List<Seat> getAllSeats() {
        return seatRepo.findAll();
    }

    public Seat getSeatById(String seatId) {
        return seatRepo.findById(seatId).get();
    }

    public Seat updateSeat(Seat seat) {
        return seatRepo.save(seat);
    }

    public boolean deleteSeat(String seatId) {
        seatRepo.deleteById(seatId);
        return !seatRepo.existsById(seatId);
    }
}
