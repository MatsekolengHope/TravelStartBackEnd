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

import com.travel.backend.entities.Flight;
import com.travel.backend.service.FlightService;

@RestController
@RequestMapping("/flight")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class FlightController {

	@Autowired
	private FlightService flightService;

	@GetMapping("/flights")
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}

	@PostMapping("/flight")
	public Flight createFlight(@RequestBody Flight flight) {
		return flightService.createFlight(flight);
	}

	@GetMapping("/search/{deparureCity}/{arrivalCity}")
	public List<Flight> searchFlights(@PathVariable String deparureCity, @PathVariable String arrivalCity) {
		return flightService.searchFlights(deparureCity, arrivalCity);
	}

	@GetMapping("/get-flight/{id}")
	public Flight getFlight(@PathVariable int id) {
		return flightService.getFlight(id);
	}
	
	@GetMapping("/delete/{id}")
	public boolean delete(@PathVariable int id) {
		return flightService.deleteFlight(id);
	}
}
