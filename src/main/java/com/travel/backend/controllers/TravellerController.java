package com.travel.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.backend.entities.traveller.Traveller;
import com.travel.backend.entities.user.User;
import com.travel.backend.service.TravellerService;

@RestController
@RequestMapping("/traveller")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class TravellerController {

	@Autowired
	TravellerService travellerService;

	@PostMapping("/create-traveller")
	public void createTraveller(@RequestBody Traveller traveller) {
		traveller.setRole("Traveller");
		travellerService.createTraveller(traveller);
	}

	@GetMapping("/traveller/{id}")
	public User getTraveller(@PathVariable long id) {
		return travellerService.getTraveller(id);
	}
}
