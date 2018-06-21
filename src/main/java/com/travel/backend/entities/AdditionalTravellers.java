package com.travel.backend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "AdditionalTravellers")
public class AdditionalTravellers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int userId;
	private String title;
	private String name;
	private String surname;
	private String cellno;
	private String address;
	private String age;
	private String seat;

	public AdditionalTravellers() {
		super();
	}

	public AdditionalTravellers(int userId, String title, String name, String surname, String cellno, String address,
			String age, String seat) {
		super();
		this.userId = userId;
		this.title = title;
		this.name = name;
		this.surname = surname;
		this.cellno = cellno;
		this.address = address;
		this.age = age;
		this.seat = seat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getCellno() {
		return cellno;
	}

	public void setCellno(String cellno) {
		this.cellno = cellno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "AdditionalTravellers [id=" + id + ", userId=" + userId + ", title=" + title + ", name=" + name
				+ ", surname=" + surname + ", cellno=" + cellno + ", address=" + address + ", age=" + age + ", seat="
				+ seat + "]";
	}

}
