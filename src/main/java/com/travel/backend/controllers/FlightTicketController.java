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

import com.travel.backend.entities.book.CarBook;
import com.travel.backend.entities.user.User;
import com.travel.backend.entities.FlightTicket;
import com.travel.backend.entities.book.BookHotel;
import com.travel.backend.service.BookCarService;
import com.travel.backend.service.FlightTicketService;
import com.travel.backend.service.BookHotelService;

@RestController
@RequestMapping("/flight-book")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class FlightTicketController {

	@Autowired
	private FlightTicketService flightTicketService;

	@Autowired
	private BookCarService bookCarService;

	@Autowired
	private BookHotelService bookHotelService;

	@PostMapping("/book-flight")
	public FlightTicket flightTicket(@RequestBody FlightTicket book) {
		return flightTicketService.flightTicket(book);
	}

	@PostMapping("/book-hotel")
	public BookHotel bookHotel(@RequestBody BookHotel book) {
		return bookHotelService.createHotelbook(book);
	}

	// NB
	@PostMapping("/book-car")
	public CarBook bookCar(@RequestBody CarBook book) {
		return bookCarService.bookCar(book);
	}


	@GetMapping("/delete/{id}")
	public Boolean deleteBooking(@PathVariable int id) {
		flightTicketService.deleteBooking(id);
		return true;
	}

	@GetMapping("/seat/{flihtId}")
	public int seat(@PathVariable int flihtId) {
		return flightTicketService.seat(flihtId);
	}

	@GetMapping("/flight-books")
	public List<FlightTicket> books() {
		return flightTicketService.books();
	}

	@GetMapping("/specific-flight-books/{flightId}")
	public List<FlightTicket> specificFlightBooks(@PathVariable Long flightId) {
		return flightTicketService.specificFlightTicket(flightId);
	}
}
