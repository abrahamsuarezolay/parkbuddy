package com.parkbuddy.ParkBuddy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "parkingspaces")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpaceVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private String location;
    private double priceperday;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private UserVO owner;

}
