package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.book.BookFlight;

public interface BookFlightRepository extends JpaRepository<BookFlight, Long>{

}
