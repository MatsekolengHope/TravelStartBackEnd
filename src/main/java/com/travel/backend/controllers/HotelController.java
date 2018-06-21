package com.travel.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.backend.entities.Hotel;
import com.travel.backend.service.HotelService;

@RestController
@RequestMapping("/hotel")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@PostMapping("/create-hotel")
	public Hotel createHotel(@RequestBody Hotel hotel) {
		return hotelService.createHotel(hotel);
	}

	@GetMapping("/search-hotels/{location}")
	public List<Hotel> searchHotels(@PathVariable String location) {
		return hotelService.searchHotels(location);
	}

	@GetMapping("/hotels")
	public List<Hotel> listHotels() {
		return hotelService.listHotels();
	}

	@GetMapping("/delete/{id}")
	public boolean delete(@PathVariable int id) {
		return hotelService.delete(id);
	}
}
