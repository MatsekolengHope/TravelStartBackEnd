package com.travel.backend.service;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.book.BookHotel;
import com.travel.backend.repositories.BookHotelRepository;

@Service
public class BookHotelService {

	@Autowired
	private BookHotelRepository bookHotelRepository;

	public BookHotel createHotelbook(BookHotel book) {
		book.setBookDate(new Date());
		book.setBookType("Hotel Book");
		return bookHotelRepository.save(book);
	}

	public List<BookHotel> hotelBookings() {
		return bookHotelRepository.findAll();
	}
}
