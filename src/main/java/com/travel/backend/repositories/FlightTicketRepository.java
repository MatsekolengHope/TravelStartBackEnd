package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.FlightTicket;

public interface FlightTicketRepository extends JpaRepository<FlightTicket, Long>{

}
