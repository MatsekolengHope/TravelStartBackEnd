package com.travel.backend.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.travel.backend.entities.traveller.Traveller;

@Entity(name = "FlightTicket")
public class FlightTicket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String flightName;
	private int flightId;
	private String travellerName;
	private String travellerSurname;
	private String departureTime;
	private String departureDate;
	private String departureCity;
	private String arrivalCity;
	private int seat;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "travellerId")
	private Traveller traveller;

	public FlightTicket() {
		super();
	}

	public FlightTicket(String flightName, int flightId, String travellerName, String travellerSurname,
			String departureTime, String departureDate, String departureCity, String arrivalCity, int seat) {
		super();
		this.flightName = flightName;
		this.flightId = flightId;
		this.travellerName = travellerName;
		this.travellerSurname = travellerSurname;
		this.departureTime = departureTime;
		this.departureDate = departureDate;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.seat = seat;
	}

	public String getTravellerName() {
		return travellerName;
	}

	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}

	public String getTravellerSurname() {
		return travellerSurname;
	}

	public void setTravellerSurname(String travellerSurname) {
		this.travellerSurname = travellerSurname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "FlightTicket [id=" + id + ", flightName=" + flightName + ", flightId=" + flightId + ", departureTime="
				+ departureTime + ", departureDate=" + departureDate + ", departureCity=" + departureCity
				+ ", arrivalCity=" + arrivalCity + ", seat=" + seat + "]";
	}

}
