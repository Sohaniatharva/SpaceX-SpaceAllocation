package com.space.space.model;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    int booking_id;
    List<Seat> seats_booked;
    Employee employee;
    BookingStatus booking_status;
    public boolean isConfirmed() {
        return this.booking_status == BookingStatus.Confirmed;
    }

    public Booking(final int id, @NonNull final List<Seat> seatsBooked, @NonNull final Employee employee){
        this.booking_id = id;
        
        this.seats_booked = seatsBooked;
        this.employee = employee;
        this.booking_status = BookingStatus.Created;
}

    public void confirmBooking() {
        if (this.booking_status != BookingStatus.Created) {
            //throw new InvalidStateException();
        }
        this.booking_status = BookingStatus.Confirmed;
    }

    public void expireBooking() {
        if (this.booking_status != BookingStatus.Created) {
            //throw new InvalidStateException();
        }
        this.booking_status = BookingStatus.Expired;
    }


}
