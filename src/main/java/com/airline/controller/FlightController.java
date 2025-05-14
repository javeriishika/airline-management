package com.airline.controller;

import com.airline.model.Flight;
import com.airline.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping
    public List<Flight> getAllFlights(@RequestParam(required = false) String sort) {
        List<Flight> flights = flightRepository.findAll();
        // sorting manually if requested
        if ("asc".equalsIgnoreCase(sort)) {
            flights.sort((a, b) -> a.getDepartureTime().compareTo(b.getDepartureTime()));
        } else if ("desc".equalsIgnoreCase(sort)) {
            flights.sort((a, b) -> b.getDepartureTime().compareTo(a.getDepartureTime()));
        }
        return flights;
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightRepository.findById(id).orElse(null);
    }
}

