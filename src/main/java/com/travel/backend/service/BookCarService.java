package com.travel.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.book.CarBook;
import com.travel.backend.repositories.BookCarRepository;

@Service
public class BookCarService {

	@Autowired
	private BookCarRepository bookCarRepository;
	
	public CarBook bookCar(CarBook book) {
		book.setBookType("Car Hire");
		book.setBookDate(new Date());
		return bookCarRepository.save(book);
	}
	
	public List<CarBook> carBookings(){
		return bookCarRepository.findAll();
	}
}
