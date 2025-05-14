package com.airline.repository;

import com.airline.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Custom queries can be added here as needed
}

