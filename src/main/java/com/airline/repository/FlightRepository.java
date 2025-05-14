package com.airline.repository;

import com.airline.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    // You can define custom queries later if needed
}

