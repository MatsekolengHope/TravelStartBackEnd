package com.travel.backend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "property")
@Inheritance(strategy = InheritanceType.JOINED)
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	private String type;
	private String phoneNo;
	private String email;
	private String status;
	private String address;

	public Property() {
		super();
	}

	public Property(Property property) {
		this.name = property.getName();
		this.location = property.getLocation();
		this.type = property.getType();
		this.phoneNo = property.getPhoneNo();
		this.email = property.getEmail();
		this.status = property.getStatus();
		this.address = property.getAddress();
	}

	public Property(String name, String location, String type, String phoneNo, String email,
			String status, String address) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.phoneNo = phoneNo;
		this.email = email;
		this.status = status;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
