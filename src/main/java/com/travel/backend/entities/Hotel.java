package com.travel.backend.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel extends Property{
	
	private int bathRooms;
	private int bedRooms;
	private int kitchens;
	private double costAdult;
	private double costChild;

	public Hotel() {
		super();
	}

	
	
	public Hotel(Property property, int bathRooms, int bedRooms, int kitchens, double costAdult, double costChild) {
		super(property);
		this.bathRooms = bathRooms;
		this.bedRooms = bedRooms;
		this.kitchens = kitchens;
		this.costAdult = costAdult;
		this.costChild = costChild;
	}

	public int getBathRooms() {
		return bathRooms;
	}

	public void setBathRooms(int bathRooms) {
		this.bathRooms = bathRooms;
	}

	public int getBedRooms() {
		return bedRooms;
	}

	public void setBedRooms(int bedRooms) {
		this.bedRooms = bedRooms;
	}

	public int getKitchens() {
		return kitchens;
	}

	public void setKitchens(int kitchens) {
		this.kitchens = kitchens;
	}

	public double getCostAdult() {
		return costAdult;
	}

	public void setCostAdult(double costAdult) {
		this.costAdult = costAdult;
	}

	public double getCostChild() {
		return costChild;
	}

	public void setCostChild(double costChild) {
		this.costChild = costChild;
	}
	
}
