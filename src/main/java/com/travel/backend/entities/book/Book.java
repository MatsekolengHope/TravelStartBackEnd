package com.travel.backend.entities.book;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@Inheritance(strategy = InheritanceType.JOINED)
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date bookDate;
	private String bookType;

	public Book() {
		super();
	}

	public Book( Date bookDate, int travellerId, String bookType) {
		super();
		this.bookDate = bookDate;
		this.bookType = bookType;
	}

	public Book(Book book) {

		this.bookDate = book.getBookDate();
		this.bookType = book.getBookType();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookDate=" + bookDate + ", bookType=" + bookType + "]";
	}

}
