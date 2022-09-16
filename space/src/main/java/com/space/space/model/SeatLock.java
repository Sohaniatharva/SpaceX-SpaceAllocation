package com.space.space.model;

import java.time.Instant;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatLock {
    private Seat seat;
    private Integer timeoutInSeconds;
    private Date lockTime;
    private Employee lockedBy;
    public boolean isLockExpired() {
        final Instant lockInstant = lockTime.toInstant().plusSeconds(timeoutInSeconds);
        final Instant currentInstant = new Date().toInstant();
        return lockInstant.isBefore(currentInstant);
    }
}




