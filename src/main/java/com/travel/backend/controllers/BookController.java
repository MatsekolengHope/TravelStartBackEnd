package com.travel.backend.controllers;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.backend.email.EmailSend;
import com.travel.backend.entities.book.Book;
import com.travel.backend.service.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class BookController {

	@Autowired
	private BookService bookService;

	@Autowired
	private EmailSend emailSend;

	@RequestMapping("/send-email/{to}/{subject}/{body}")
	public boolean sendMail(@PathVariable String to, @PathVariable String subject, @PathVariable String body)
			throws MessagingException {
		
		emailSend.send(to, subject, body);
		return true;
	}

	@GetMapping("/bookings")
	public List<Book> getAllBookings() {
		return bookService.getAllBookings();
	}

	/*
	 * @GetMapping("/bookings/{id}") public List<Book> findAllById(@PathVariable int
	 * id) { return bookService.findAllById(id); }
	 */

	@PostMapping("/book")
	public Book book(Book book) {
		return bookService.book(book);
	}

	@GetMapping("/delete/{id}")
	public boolean cancelBooking(@PathVariable int id) {
		return bookService.cancelBooking(id);
	}
}
