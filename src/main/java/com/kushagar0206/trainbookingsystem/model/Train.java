package com.kushagar0206.trainbookingsystem.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainName;
    private String trainNumber;
    private String source;
    private String destination;
    private String totalSeats;
    private String availableSeats;

    public Train(String trainName, String trainNumber, String source, String destination, String totalSeats, String availableSeats) {

        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }

}


