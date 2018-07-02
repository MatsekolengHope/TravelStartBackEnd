package com.travel.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.entities.book.Book;
import com.travel.backend.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBookings() {
		return bookRepository.findAll();
	}

	/*public List<Book> findAllById(@PathVariable int id) {
		List<Book> books = new ArrayList<>();
		for(Book book: bookRepository.findAll()) {
			if(book.) {
				
			}
		}
		
		return books;
	}*/

	public Book book(Book book) {
		return bookRepository.save(book);
	}

	public boolean cancelBooking(int id) {
		for (int index = 0; index < bookRepository.findAll().size(); index++) {
			if (bookRepository.findAll().get(index).getId() == id) {
				bookRepository.delete(bookRepository.findAll().get(index));
				break;
			}
		}

		return true;
	}
}
