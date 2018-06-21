package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
