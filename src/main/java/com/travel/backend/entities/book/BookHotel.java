package com.travel.backend.entities.book;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_book")
public class BookHotel extends Book{
	private int hotelId;
	private Date checkInDate;
	private Date checkOutDate;
	private int userId;

	public BookHotel() {
		super();
	}

	public BookHotel(Book book, int hotelId, Date checkInDate, Date checkOutDate, int userId) {
		super(book);
		this.hotelId = hotelId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.userId = userId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "HotelBook [hotelId=" + hotelId + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", userId=" + userId + "]";
	}

}
