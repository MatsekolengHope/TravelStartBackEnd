package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.book.CarBook;

public interface BookCarRepository extends JpaRepository<CarBook, Long>{

}
