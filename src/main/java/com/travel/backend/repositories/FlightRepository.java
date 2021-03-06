package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

}
