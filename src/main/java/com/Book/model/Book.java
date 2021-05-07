package com.Book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookPrimaryKey")
	private int id;
	@Column(name = "BookName")
	private String bookName;
	@Column(name = "AuthorName")
	private String authorName;
	@Column(name = "Price")
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, String authorName, double price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + "]";
	}
       
}
