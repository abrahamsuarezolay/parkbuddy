package com.parkbuddy.ParkBuddy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UserRoles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRolVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "user")
    private UserVO user;

    @ManyToOne
    @JoinColumn(name = "role")
    private RolVO role;

}
