package com.ihor.flight_reservation.entities;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class User extends AbstractEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
