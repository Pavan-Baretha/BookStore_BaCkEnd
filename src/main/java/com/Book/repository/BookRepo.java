package com.Book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Book.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
