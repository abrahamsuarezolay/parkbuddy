package com.parkbuddy.ParkBuddy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }) })
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<ParkingSpaceVO> ownedspaces;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<BookingVO> bookings;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<UserRolVO> roles;

    public UserVO(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
