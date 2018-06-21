package com.travel.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.book.BookFlight;
import com.travel.backend.entities.user.User;
import com.travel.backend.repositories.BookFlightRepository;
import com.travel.backend.repositories.UserRepository;

@Service
public class BookFlightService {

	@Autowired
	private BookFlightRepository bookFlightRepository;
	@Autowired
	private FlightService flightService;
	@Autowired
	private UserRepository userRepository;

	public BookFlight bookFlight(BookFlight flightBook) {
		flightBook.setBookType("Flight Booking");
		return bookFlightRepository.save(flightBook);
	}

	public BookFlight findBooking(int i) {
		// TODO Auto-generated method stub
		BookFlight book = new BookFlight();

		for (int index = 0; index < bookFlightRepository.findAll().size(); index++) {
			if (bookFlightRepository.findAll().get(index).getTravellerId() == i) {
				book = bookFlightRepository.findAll().get(index);
			}
		}

		return book;
	}

	public List<BookFlight> myBookings(int i) {
		// TODO Auto-generated method stub
		List<BookFlight> bookings = new ArrayList<BookFlight>();

		for (int index = 0; index < bookFlightRepository.findAll().size(); index++) {
			if (bookFlightRepository.findAll().get(index).getTravellerId() == i) {
				bookings.add(bookFlightRepository.findAll().get(index));
			}
		}

		return bookings;
	}

	public Boolean deleteBooking(int id) {

		for (BookFlight book : bookFlightRepository.findAll()) {
			if (book.getId() == id) {
				bookFlightRepository.delete(book);
				break;
			}
		}

		return true;
	}

	public BookFlight getFlightBook(int id) {

		BookFlight fb = new BookFlight();

		for (BookFlight book : bookFlightRepository.findAll()) {
			if (book.getId() == id) {
				fb = book;
				break;
			}
		}

		return fb;
	}

	public int seat(int flightId) {

		int seat = -1;
		List<Integer> seats = new ArrayList<>();

		int capacity = flightService.getFlight(flightId).getCapacity();

		for (int i = 1; i < bookFlightRepository.findAll().size(); i++) {
			if (bookFlightRepository.findAll().get(i).getFlightId() == flightId) {
				seats.add(bookFlightRepository.findAll().get(i).getSeat());
			}
		}

		for (int x = 1; x <= capacity; x++) {
			if (seats.contains(x)) {
				continue;
			} else {
				seat = x;
				break;
			}
		}

		return seat;
	}

	public List<BookFlight> books() {
		// TODO Auto-generated method stub
		return bookFlightRepository.findAll();
	}

	public List<BookFlight> specificFlightBooks(Long id) {
		// TODO Auto-generated method stub
		List<BookFlight> books = new ArrayList<>();

		for (BookFlight book : bookFlightRepository.findAll()) {
			if (book.getFlightId() == id) {
				books.add(book);
			}
		}

		return books;
	}

	public List<User> bookedUsers(int flightId) {
		List<User> users = new ArrayList<>();

		List<User> list = userRepository.findAll();

		for (BookFlight bookFlight : specificFlightBooks((long) flightId)) {
			for (User user : list) {
				if (bookFlight.getTravellerId() == user.getId()) {
					users.add(user);
					break;
				}
			}
		}

		return users;
	}
}
