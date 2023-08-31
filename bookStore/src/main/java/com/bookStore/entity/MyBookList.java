package com.bookStore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	
    @Entity
	@Table(name="MyBooks")
	public class MyBookList implements Serializable{

		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="ID")
		int id;
		
		@Column(name="NAME")
		String name;

		@Column(name="AUTHOR")
		String author;
		
		@Column(name="PRICE")
		String price;
		
		
	public MyBookList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyBookList(int id, String name, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
