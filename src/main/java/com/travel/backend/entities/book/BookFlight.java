package com.travel.backend.entities.book;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "flight_book")
public class BookFlight extends Book {
	private int flightId;
	private int travellerId;
	private int seat;
	private String travellerName;
	private String travellerSurname;

	public BookFlight() {
		super();
	}

	public BookFlight(Book book, int flightId, int travellerId, String travellerName, String travellerSurname) {
		super(book);
		this.flightId = flightId;
		this.travellerId = travellerId;
		this.travellerName = travellerName;
		this.travellerSurname = travellerSurname;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getTravellerId() {
		return travellerId;
	}

	public void setTravellerId(int travellerId) {
		this.travellerId = travellerId;
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

	@Override
	public String toString() {
		return "BookFlight [flightId=" + flightId + ", travellerId=" + travellerId + ", seat=" + seat
				+ ", travellerName=" + travellerName + ", travellerSurname=" + travellerSurname + "]";
	}


}
