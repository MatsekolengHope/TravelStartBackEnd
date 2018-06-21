package com.travel.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.AdditionalTravellers;
import com.travel.backend.repositories.AdditionalTravellersRepository;

@Service
public class AdditionalTravellersService {

	@Autowired
	private AdditionalTravellersRepository additionalTravellersRepository;

	public AdditionalTravellers add(AdditionalTravellers additionalTravellers) {
		return additionalTravellersRepository.save(additionalTravellers);
	}

	public List<AdditionalTravellers> travellers(int userId) {
		List<AdditionalTravellers> additionalTravellers = new ArrayList<>();

		for (AdditionalTravellers additionalTraveller : additionalTravellersRepository.findAll()) {
			if (additionalTraveller.getUserId() == userId) {
				additionalTravellers.add(additionalTraveller);
			}
		}

		return additionalTravellers;
	}
}
