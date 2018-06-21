package com.travel.backend.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Date departuredate;
	private String departurecity;
	private String departuretime;
	private Date arrivaldate;
	private String arrivalcity;
	private String arrivaltime;
	private int capacity;
	private double fareAdult;
	private double fareChild;
	private int availableTickets;

	public Long getId() {
		return id;
	}
	
	public Flight(String name, Date departuredate, String departurecity, String departuretime, Date arrivaldate,
			String arrivalcity, String arrivaltime, int capacity, double fareAdult, double fareChild,
			int availableTickets, int bookedTickets) {
		super();
		this.name = name;
		this.departuredate = departuredate;
		this.departurecity = departurecity;
		this.departuretime = departuretime;
		this.arrivaldate = arrivaldate;
		this.arrivalcity = arrivalcity;
		this.arrivaltime = arrivaltime;
		this.capacity = capacity;
		this.fareAdult = fareAdult;
		this.fareChild = fareChild;
		this.availableTickets = availableTickets;
		this.bookedTickets = bookedTickets;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDeparturedate() {
		return departuredate;
	}

	public void setDeparturedate(Date departuredate) {
		this.departuredate = departuredate;
	}

	public String getDeparturecity() {
		return departurecity;
	}

	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}

	public String getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}

	public Date getArrivaldate() {
		return arrivaldate;
	}

	public void setArrivaldate(Date arrivaldate) {
		this.arrivaldate = arrivaldate;
	}

	public String getArrivalcity() {
		return arrivalcity;
	}

	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}

	public String getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getFareAdult() {
		return fareAdult;
	}

	public void setFareAdult(double fareAdult) {
		this.fareAdult = fareAdult;
	}

	public double getFareChild() {
		return fareChild;
	}

	public void setFareChild(double fareChild) {
		this.fareChild = fareChild;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}

	public int getBookedTickets() {
		return bookedTickets;
	}

	public void setBookedTickets(int bookedTickets) {
		this.bookedTickets = bookedTickets;
	}

	private int bookedTickets;

	public Flight() {
		super();
	}


	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", departuredate=" + departuredate + ", departurecity="
				+ departurecity + ", departuretime=" + departuretime + ", arrivaldate=" + arrivaldate + ", arrivalcity="
				+ arrivalcity + ", arrivaltime=" + arrivaltime + ", capacity=" + capacity + ", fareAdult=" + fareAdult
				+ ", fareChild=" + fareChild + ", availableTickets=" + availableTickets + ", bookedTickets="
				+ bookedTickets + "]";
	}

}
