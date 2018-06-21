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
import com.travel.backend.entities.book.BookFlight;
import com.travel.backend.entities.book.BookHotel;
import com.travel.backend.service.BookCarService;
import com.travel.backend.service.BookFlightService;
import com.travel.backend.service.BookHotelService;

@RestController
@RequestMapping("/flight-book")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class BookFlightController {

	@Autowired
	private BookFlightService bookFlightService;

	@Autowired
	private BookCarService bookCarService;

	@Autowired
	private BookHotelService bookHotelService;

	@PostMapping("/book-flight")
	public BookFlight bookFlight(@RequestBody BookFlight book) {
		return bookFlightService.bookFlight(book);
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

	@GetMapping("/find-flight-booking/{i}")
	public BookFlight findBooking(@PathVariable int i) {
		return bookFlightService.findBooking(i);
	}

	@GetMapping("/find-flight-bookings/{i}")
	public List<BookFlight> myBookings(@PathVariable int i) {
		// TODO Auto-generated method stub
		return bookFlightService.myBookings(i);
	}

	@GetMapping("/delete/{id}")
	public Boolean deleteBooking(@PathVariable int id) {
		bookFlightService.deleteBooking(id);
		return true;
	}

	@GetMapping("/seat/{flihtId}")
	public int seat(@PathVariable int flihtId) {
		return bookFlightService.seat(flihtId);
	}

	@GetMapping("/flight-books")
	public List<BookFlight> books() {
		return bookFlightService.books();
	}

	@GetMapping("/specific-flight-books/{flightId}")
	public List<BookFlight> specificFlightBooks(@PathVariable Long flightId) {
		return bookFlightService.specificFlightBooks(flightId);
	}

	@GetMapping("/seat-booked-users/{flightId}")
	public List<User> bookedUser(@PathVariable int flightId) {
		return bookFlightService.bookedUsers(flightId);
	}
}
