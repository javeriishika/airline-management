package com.example.airline.service;

import com.example.airline.model.Flight;
import com.example.airline.repository.FlightRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FlightServiceTest {

    private FlightRepository mockRepo;
    private FlightService flightService;

    // This method will run before each test to set up the mocks
    @BeforeEach
    public void setUp() {
        // Create a mock of FlightRepository
        mockRepo = mock(FlightRepository.class);

        // Inject the mock into the service
        flightService = new FlightService(mockRepo);
    }

    // Test case for getting all flights
    @Test
    public void testGetAllFlights() {
        // Given some mock data
        Flight flight1 = new Flight(1L, "Indigo", "Delhi", "Mumbai");
        Flight flight2 = new Flight(2L, "Air India", "Chennai", "Kolkata");

        // Mock the repository method to return the flight data
        when(mockRepo.findAll()).thenReturn(Arrays.asList(flight1, flight2));

        // Call the service method
        List<Flight> flights = flightService.getAllFlights();

        // Verify that the correct number of flights were returned
        assertEquals(2, flights.size(), "The flight list should have 2 flights");

        // Verify that the repository method was called exactly once
        verify(mockRepo, times(1)).findAll();
    }

    // Add more test methods as needed
}

