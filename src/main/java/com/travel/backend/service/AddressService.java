package com.travel.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.Address;
import com.travel.backend.repositories.AddressRepository;
import com.travel.backend.repositories.TravellerRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private TravellerService travellerService;

	@Autowired
	private TravellerRepository travellerRepository;

	public Address add(Address address) {
		return addressRepository.save(address);
	}

	public Address update(Address address) {
		return addressRepository.save(address);
	}

	public void delete(Address address) {
		addressRepository.delete(address);
	}

	public List<Address> getAddresses(Long id) {

		List<Address> addresses = new ArrayList<Address>();

		/*for(Address targetAddress: addressRepository.findAll()) {
			if(targetAddress.getTraveller().getId() == id) {
				addresses.add(targetAddress);
			}
		}*/

		return addresses;
	}
}
