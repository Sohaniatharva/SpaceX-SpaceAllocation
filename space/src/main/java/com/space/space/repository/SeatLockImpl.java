package com.space.space.repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.space.space.model.Employee;
import com.space.space.model.Seat;
import com.space.space.model.SeatLock;

import lombok.NonNull;

public class SeatLockImpl implements SeatLock{
    private final Integer lockTimeout;
    private final  Map<Seat, SeatLock> locks;

    public SeatLockImpl(@NonNull final Integer lockTimeout) {
        this.locks = new HashMap<>();
        this.lockTimeout = lockTimeout;
    }

    private boolean isSeatLocked(final Seat seat) {
        return false;
    }
 

    @Override
    synchronized public void lockSeats(List<Seat> seats, Employee employee) {
        for (Seat seat : seats) {
            if (isSeatLocked(seat)) {
               // throw new SeatTemporaryUnavailableException();
            }
        }

        for (Seat seat : seats) {
            lockSeat( seat, employee, lockTimeout);
        }
        
    }
    private void lockSeat( final Seat seat, final Employee employee, final Integer timeoutInSeconds) {
        if (!locks.containsKey(seat)) {
            locks.put(seat, new SeatLock());
        }
        final SeatLock lock = new SeatLock(seat, timeoutInSeconds, new Date(), employee);
        locks.put(seat, lock);
    }

    @Override
    public void unlockSeats(List<Seat> seat, Employee employee) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean validateLock(Seat seat, Employee employee) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Seat> getLockedSeats() {
        // TODO Auto-generated method stub
        return null;
    }
    
}


/*package com.uditagarwal.providers;

import com.google.common.collect.ImmutableList;
import com.uditagarwal.exceptions.SeatTemporaryUnavailableException;
import com.uditagarwal.model.Seat;
import com.uditagarwal.model.SeatLock;
import com.uditagarwal.model.Show;
import lombok.NonNull;

import java.util.*;

public class InMemorySeatLockProvider implements SeatLockProvider {

 

   

    @Override
    public void unlockSeats(@NonNull final Show show, @NonNull final List<Seat> seats, @NonNull final String user) {
        for (Seat seat: seats) {
            if (validateLock(show, seat, user)) {
                unlockSeat(show, seat);
            }
        }
    }

    @Override
    public boolean validateLock(@NonNull final Show show, @NonNull final Seat seat, @NonNull final String user) {
        return isSeatLocked(show, seat) && locks.get(show).get(seat).getLockedBy().equals(user);
    }

    @Override
    public List<Seat> getLockedSeats(@NonNull final Show show) {
        if (!locks.containsKey(show)) {
            return ImmutableList.of();
        }
        final List<Seat> lockedSeats = new ArrayList<>();

        for (Seat seat : locks.get(show).keySet()) {
            if (isSeatLocked(show, seat)) {
                lockedSeats.add(seat);
            }
        }
        return lockedSeats;
    }

    private void unlockSeat(final Show show, final Seat seat) {
        if (!locks.containsKey(show)) {
            return;
        }
        locks.get(show).remove(seat);
    }

    private void lockSeat(final Show show, final Seat seat, final String user, final Integer timeoutInSeconds) {
        if (!locks.containsKey(show)) {
            locks.put(show, new HashMap<>());
        }
        final SeatLock lock = new SeatLock(seat, show, timeoutInSeconds, new Date(), user);
        locks.get(show).put(seat, lock);
    }

    private boolean isSeatLocked(final Show show, final Seat seat) {
        return locks.containsKey(show) && locks.get(show).containsKey(seat) && !locks.get(show).get(seat).isLockExpired();
    }
} */