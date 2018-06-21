package com.travel.backend.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends Property{

	private double cost;
	private String fuelPolicy;
	private int lagage_bags;
	private String model;
	private int capacity;

	public Car() {
		super();
	}

	public Car(Property property, double cost, String fuelPolicy, int lagage_bags, String model, int capacity) {
		super(property);
		this.cost = cost;
		this.fuelPolicy = fuelPolicy;
		this.lagage_bags = lagage_bags;
		this.model = model;
		this.capacity = capacity;
		
		
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getFuelPolicy() {
		return fuelPolicy;
	}

	public void setFuelPolicy(String fuelPolicy) {
		this.fuelPolicy = fuelPolicy;
	}

	public int getLagage_bags() {
		return lagage_bags;
	}

	public void setLagage_bags(int lagage_bags) {
		this.lagage_bags = lagage_bags;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
