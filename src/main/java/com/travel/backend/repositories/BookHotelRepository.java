package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.book.BookHotel;

public interface BookHotelRepository extends JpaRepository<BookHotel, Long>{

}
