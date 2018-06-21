package com.travel.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.Hotel;
import com.travel.backend.repositories.HotelRepository;

@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	public Hotel createHotel(Hotel hotel) {
		hotel.setType("Hotel Rentals");
		hotel.setStatus("Available");
		return hotelRepository.save(hotel);
	}

	public List<Hotel> searchHotels(String location) {
		List<Hotel> hotels = new ArrayList<Hotel>();

		for (Hotel hotel : hotelRepository.findAll()) {
			if (hotel.getLocation().toLowerCase().contains(location.toLowerCase())) {
				hotels.add(hotel);
			}
		}

		return hotels;
	}
	
	public List<Hotel> listHotels(){
		return hotelRepository.findAll();
	}

	public boolean delete(int id) {
		boolean deleted = false;
		for(Hotel hotel: listHotels()) {
			if(hotel.getId() == id) {
				hotelRepository.delete(hotel);
				deleted = true;
			}
		}
		return deleted;
	}
}
