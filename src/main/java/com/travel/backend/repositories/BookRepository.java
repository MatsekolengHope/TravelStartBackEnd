package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.book.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
