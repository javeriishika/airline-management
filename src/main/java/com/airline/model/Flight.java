package com.airline.model;

import jakarta.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String FlightNumber;
    private String Origin;
    private String destination;
    private String departureTime;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public void setId(Long id){
    this.id = id;
               }
public String getFlightNumber(){return flightNumber;}
public void setFlightNumber(String flightNumber){this.flightNumber = flightNumber;}
  
public String getOrigin(){return origin;}
public void setOrigin(String origin){this.origin = origin;}

public String getDestination(){return destination;}
public void setDestination(String destination){this.destination = destination;}

    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getDepartureTime() { return departureTime; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }
}

