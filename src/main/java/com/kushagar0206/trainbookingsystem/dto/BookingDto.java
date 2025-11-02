package com.kushagar0206.trainbookingsystem.dto;

import com.kushagar0206.trainbookingsystem.model.Train;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainName;
    private String trainNumber;
    private String userEmail;
    private String passengerName;
    private String seatsBooked;
    private String amountPaid;
    private String status;     // BOOKED or CANCELLED
    private LocalDateTime bookedDate;

    public BookingDto(String trainName, String trainNumber, String userEmail, String passengerName, String seatsBooked, String amountPaid, String status, LocalDateTime bookedDate) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.userEmail = userEmail;
        this.passengerName = passengerName;
        this.seatsBooked = seatsBooked;
        this.amountPaid = amountPaid;
        this.status = status;
        this.bookedDate = bookedDate;
    }

}


