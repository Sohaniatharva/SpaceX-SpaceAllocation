package com.space.space.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    String seat_id;
    boolean isBooked;
    Employee bookedBywho;
    boolean isBookedByTLM;
    boolean isBookedByMLM;
    boolean isBookedByLLM;

}
