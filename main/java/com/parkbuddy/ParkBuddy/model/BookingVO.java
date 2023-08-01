package com.parkbuddy.ParkBuddy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate startdate;
    private LocalDate enddate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserVO user;

    @ManyToOne
    @JoinColumn(name = "parkingspace_id", nullable = false)
    private ParkingSpaceVO parkingspace;
}
