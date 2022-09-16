package com.space.space.repository;
import java.util.List;

import com.space.space.model.Employee;
import com.space.space.model.Seat;

public interface SeatLock {
    void lockSeats( List<Seat> seat, Employee employee);
    void unlockSeats( List<Seat> seat, Employee employee);
    boolean validateLock(Seat seat, Employee employee);
    List<Seat> getLockedSeats();
    boolean isSeatLocked();
}





