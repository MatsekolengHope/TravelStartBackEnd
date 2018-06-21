package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.traveller.Traveller;

public interface TravellerRepository extends JpaRepository<Traveller, Long>{

}
