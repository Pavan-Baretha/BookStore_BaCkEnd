package com.Book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Book.model.Book;
import com.Book.repository.BookRepo;

//@CrossOrigin(origins = "https://localhost:3000")
@CrossOrigin
@RestController
@RequestMapping(path="book")
public class BookController {

	@Autowired
	BookRepo bookRepo;
	
	@PostMapping("addBook")
	public Book addBook(@RequestBody Book book) {
		return bookRepo.save(book);
	}
	@GetMapping("getBook")
	public List<Book> getBook(){
		return bookRepo.findAll();
	}
}
