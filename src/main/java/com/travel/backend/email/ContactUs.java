package com.travel.backend.email;

public class ContactUs {

	private String name;
	private String surname;
	private String email;
	private String message;

	public ContactUs() {
		super();
	}

	public ContactUs(String name, String surname, String email, String message) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
