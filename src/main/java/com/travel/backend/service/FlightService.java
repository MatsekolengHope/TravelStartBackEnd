package com.travel.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.travel.backend.entities.Flight;
import com.travel.backend.repositories.BookFlightRepository;
import com.travel.backend.repositories.FlightRepository;

@Service
public class FlightService {

	@Autowired
	private FlightRepository flightRepository;

	@Autowired
	private BookFlightRepository bookFlightRepository;

	public List<Integer> bookedTickets(long flightId) {
		List<Integer> seats = new ArrayList<>();

		for (int i = 1; i < bookFlightRepository.findAll().size(); i++) {
			if (bookFlightRepository.findAll().get(i).getFlightId() == flightId) {
				seats.add(bookFlightRepository.findAll().get(i).getSeat());
			}
		}

		return seats;
	}

	public Flight createFlight(@RequestBody Flight flight) {
		return flightRepository.save(flight);
	}

	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}

	public boolean deleteFlight(long id) {
		flightRepository.delete(flightRepository.getOne(id));
		return true;
	}

	public Flight getFlight(@PathVariable int id) {
		Flight flight = new Flight();

		for (int x = 0; x < flightRepository.findAll().size(); x++) {
			if (flightRepository.findAll().get(x).getId() == id) {
				flight = flightRepository.findAll().get(x);
				break;
			}
		}

		return flight;
	}

	public List<Flight> searchFlights(@PathVariable String deparureCity, @PathVariable String arrivalCity) {
		List<Flight> flights = new ArrayList<>();
		long flightId = -1;

		for (int x = 0; x < getAllFlights().size(); x++) {
			if (flightRepository.findAll().get(x).getDeparturecity().toLowerCase().contains(deparureCity.toLowerCase())
					&& flightRepository.findAll().get(x).getArrivalcity().toLowerCase()
							.contains(arrivalCity.toLowerCase())) {
				flightId = flightRepository.findAll().get(x).getId();
				if (getFlight((int) flightId).getCapacity() > bookedTickets(flightId).size()) {
					flights.add(getAllFlights().get(x));
				}
			}
		}

		return flights;
	}

	@GetMapping("/get-flights-by-id/{id}")
	public List<Flight> searchFlightsById(@PathVariable int id) {
		List<Flight> flights = new ArrayList<>();

		for (int x = 0; x < flightRepository.findAll().size(); x++) {
			if (flightRepository.findAll().get(x).getId() == id) {
				flights.add(flightRepository.findAll().get(x));
			}
		}
		return flights;
	}
}
