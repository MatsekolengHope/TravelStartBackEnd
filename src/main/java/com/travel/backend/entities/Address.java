package com.travel.backend.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.travel.backend.entities.traveller.Traveller;

@Entity(name = "address")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Address{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String country;
	private String province;
	private String city;
	private String town;
	private String resident;
	private String street;
	private int houseNo;
	private int residentailCode;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Traveller traveller;

	public Address() {
		super();
	}

	public Address(String country, String province, String city, String town, String resident, String street,
			int houseNo, int residentailCode) {
		super();
		this.country = country;
		this.province = province;
		this.city = city;
		this.town = town;
		this.resident = resident;
		this.street = street;
		this.houseNo = houseNo;
		this.residentailCode = residentailCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getResident() {
		return resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public int getResidentailCode() {
		return residentailCode;
	}

	public void setResidentailCode(int residentailCode) {
		this.residentailCode = residentailCode;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", province=" + province + ", city=" + city + ", town="
				+ town + ", resident=" + resident + ", street=" + street + ", houseNo=" + houseNo + ", residentailCode="
				+ residentailCode + "]";
	}

}
