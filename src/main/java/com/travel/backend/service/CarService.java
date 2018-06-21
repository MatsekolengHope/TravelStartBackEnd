package com.travel.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.Car;
import com.travel.backend.repositories.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public Car addCar(Car car) {
		car.setStatus("Available");
		car.setType("Car Hire");
		return carRepository.save(car);
	}

	public List<Car> searchCars(String pickUpLocation, String dropOffLocation) {
		List<Car> cars = new ArrayList<>();

		for (Car car : carRepository.findAll()) {
			if (car.getLocation().toLowerCase().contains(pickUpLocation.toLowerCase())
					|| car.getLocation().toLowerCase().contains(dropOffLocation.toLowerCase())) {
				if (car.getStatus().equals("Available")) {
					cars.add(car);
				}
			}
		}

		return cars;
	}

	public List<Car> cars() {
		return carRepository.findAll();
	}

	public boolean delete(int id) {
		boolean result = false;
		for (Car car : cars()) {
			if (car.getId() == id) {
				carRepository.delete(car);
				result = true;
			}
		}
		return result;
	}
}
