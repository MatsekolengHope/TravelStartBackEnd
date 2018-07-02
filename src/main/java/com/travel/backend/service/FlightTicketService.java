package com.travel.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.FlightTicket;
import com.travel.backend.repositories.FlightTicketRepository;
import com.travel.backend.repositories.UserRepository;

@Service
public class FlightTicketService {

	@Autowired
	private FlightTicketRepository flightTicketRepository;
	@Autowired
	private FlightService flightService;
	@Autowired
	private UserRepository userRepository;

	public FlightTicket flightTicket(FlightTicket flightTicket) {
		return flightTicketRepository.save(flightTicket);
	}

	public Boolean deleteBooking(int id) {

		for (FlightTicket book : flightTicketRepository.findAll()) {
			if (book.getId() == id) {
				flightTicketRepository.delete(book);
				break;
			}
		}

		return true;
	}

	public FlightTicket getFlightBook(int id) {

		FlightTicket ticket = new FlightTicket();

		for (FlightTicket book : flightTicketRepository.findAll()) {
			if (book.getId() == id) {
				ticket = book;
				break;
			}
		}

		return ticket;
	}

	public int seat(int flightId) {

		int seat = -1;
		List<Integer> seats = new ArrayList<>();

		int capacity = flightService.getFlight(flightId).getCapacity();

		for (int i = 1; i < flightTicketRepository.findAll().size(); i++) {
			if (flightTicketRepository.findAll().get(i).getFlightId() == flightId) {
				seats.add(flightTicketRepository.findAll().get(i).getSeat());
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

	public List<FlightTicket> books() {
		// TODO Auto-generated method stub
		return flightTicketRepository.findAll();
	}

	public List<FlightTicket> specificFlightTicket(Long id) {
		// TODO Auto-generated method stub
		List<FlightTicket> tickets = new ArrayList<>();

		for (FlightTicket ticket : flightTicketRepository.findAll()) {
			if (ticket.getFlightId() == id) {
				tickets.add(ticket);
			}
		}

		return tickets;
	}
}
