package com.airline.controller;

import com.airline.model.Ticket;
import com.airline.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deleteTicket(@PathVariable Long id) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if (ticket.isPresent()) {
            ticketRepository.deleteById(id);
            return "Ticket cancelled successfully.";
        } else {
            return "Ticket not found.";
        }
    }
}

