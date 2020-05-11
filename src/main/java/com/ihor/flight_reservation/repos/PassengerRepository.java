package com.ihor.flight_reservation.repos;

import com.ihor.flight_reservation.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
