package com.kushagar0206.trainbookingsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
public class Booking{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainName;
    private String trainNumber;
    private String userEmail;
    private String passengerName;
    private String seatsBooked;
    private String amountPaid;
    private String status;                   // BOOKED or CANCELLED
    private LocalDateTime bookedDate;

    public Booking( String trainName, String trainNumber, String userEmail, String passengerName, String seatsBooked, String amountPaid, String status) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.userEmail = userEmail;
        this.passengerName = passengerName;
        this.seatsBooked = seatsBooked;
        this.amountPaid = amountPaid;
        this.status = status;
    }
}

