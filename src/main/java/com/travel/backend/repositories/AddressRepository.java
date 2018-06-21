package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
