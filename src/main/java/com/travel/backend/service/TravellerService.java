package com.travel.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.travel.backend.entities.traveller.Traveller;
import com.travel.backend.repositories.TravellerRepository;

@Service
public class TravellerService {

	@Autowired
	TravellerRepository travellerRepository;

	public void createTraveller(@RequestBody Traveller traveller) {
		traveller.setRole("Traveller");
		travellerRepository.save(traveller);
	}

	public Traveller getTraveller(long id) {
		Traveller traveller = new Traveller();

		for (int index = 0; index < travellerRepository.findAll().size(); index++) {
			if (travellerRepository.findAll().get(index).getId().equals(id)) {
				traveller = travellerRepository.findAll().get(index);
				break;
			}
		}

		return traveller;
	}

}
