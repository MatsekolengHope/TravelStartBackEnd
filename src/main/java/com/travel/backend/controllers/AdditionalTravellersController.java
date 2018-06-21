package com.travel.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.backend.entities.AdditionalTravellers;
import com.travel.backend.service.AdditionalTravellersService;

@RestController
@RequestMapping("/additional-traveller")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class AdditionalTravellersController {

	@Autowired
	private AdditionalTravellersService additionalTravellersService;;

	@PostMapping("/create-additional-traveller")
	public AdditionalTravellers add(@RequestBody AdditionalTravellers additionalTravellers) {
		return additionalTravellersService.add(additionalTravellers);
	}
	
	@RequestMapping("/additional-travellers/{userId}")
	public List<AdditionalTravellers> travellers(@PathVariable int userId){
		return additionalTravellersService.travellers(userId);
	}
}
