package com.space.space.repository;

import com.space.space.model.Seat;

import java.util.List;

public interface SeatRepo {
    public Seat addSeat(Seat seat);

    public List<Seat> getAllSeats();

    public Seat getSeatById(String seatId);
}
