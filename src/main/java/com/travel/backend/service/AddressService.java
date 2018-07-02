package com.travel.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.Address;
import com.travel.backend.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public Address add(Address address) {
		return addressRepository.save(address);
	}

	public Address update(Address address) {
		return addressRepository.save(address);
	}

	public void delete(Address address) {
		addressRepository.delete(address);
	}
}
