package com.travel.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.backend.entities.book.BookHotel;
import com.travel.backend.service.BookHotelService;

@RestController
@RequestMapping("/flight-book")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class BookHotelController {

	@Autowired
	private BookHotelService bookHotelService;
	
	public List<BookHotel> hotelBookings() {
		return bookHotelService.hotelBookings();
	}
}
