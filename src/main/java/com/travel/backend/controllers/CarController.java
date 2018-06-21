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

import com.travel.backend.entities.Car;
import com.travel.backend.service.CarService;

@RestController
@RequestMapping("/car")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CarController {

	@Autowired
	private CarService carService;

	@PostMapping("/create-car")
	public Car createCar(@RequestBody Car car) {
		return carService.addCar(car);
	}

	@GetMapping("/search-cars/{pickUpLocation}/{dropOffLocation}")
	public List<Car> searchCars(@PathVariable String pickUpLocation, @PathVariable String dropOffLocation) {
		return carService.searchCars(pickUpLocation, dropOffLocation);
	}

	@GetMapping("/cars")
	public List<Car> cars() {
		return carService.cars();
	}
	
	@GetMapping("/delete/{id}")
	public boolean delete(@PathVariable int id) {
		return carService.delete(id);
	}
}
