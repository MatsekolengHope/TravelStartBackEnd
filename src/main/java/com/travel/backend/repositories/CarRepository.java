package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long>{

}
