package com.travel.backend.entities.book;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_book")
public class CarBook extends Book {
	private int carId;
	private String pickUpLocation;
	private String pickUpTime;
	private String dropOffLocation;
	private String dropOffTime;
	private Date dropOffDate;
	private Date pickUpDate;

	public Date getDropOffDate() {
		return dropOffDate;
	}

	public void setDropOffDate(Date dropOffDate) {
		this.dropOffDate = dropOffDate;
	}

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public CarBook() {
		super();
	}

	public CarBook(int carId, String pickUpLocation, String pickUpTime, String dropOffLocation, String dropOffTime,
			Book book) {
		super(book);
		this.carId = carId;
		this.pickUpLocation = pickUpLocation;
		this.pickUpTime = pickUpTime;
		this.dropOffLocation = dropOffLocation;
		this.dropOffTime = dropOffTime;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public String getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getDropOffLocation() {
		return dropOffLocation;
	}

	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}

	public String getDropOffTime() {
		return dropOffTime;
	}

	public void setDropOffTime(String dropOffTime) {
		this.dropOffTime = dropOffTime;
	}

}
