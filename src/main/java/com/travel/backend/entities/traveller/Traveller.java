package com.travel.backend.entities.traveller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.travel.backend.entities.Address;
import com.travel.backend.entities.FlightTicket;
import com.travel.backend.entities.user.User;

@Entity
@Table(name = "traveller")
public class Traveller extends User{

	@OneToMany(mappedBy="traveller", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Address> addresses = new ArrayList<Address>();
	
	@OneToMany(mappedBy="traveller", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<FlightTicket> flightTickets = new ArrayList<FlightTicket>();

	public Traveller() {
	}

	public Traveller(User user, List<Address> addresses) {
		super(user);
		this.addresses = addresses;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<FlightTicket> getFlightTickets() {
		return flightTickets;
	}

	public void setFlightTickets(List<FlightTicket> flightTickets) {
		this.flightTickets = flightTickets;
	}

}
