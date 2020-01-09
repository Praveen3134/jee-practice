package org.training.practice.servlet;

public class Book {

    private String title;
    private String author;
    private String imageURI;
    private float price;
    private String description;
    private String isbn;

    public String getIsbn() {
	return isbn;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public String getImageURI() {
	return imageURI;
    }

    public void setImageURI(String imageURI) {
	this.imageURI = imageURI;
    }

    public float getPrice() {
	return price;
    }

    public void setPrice(float price) {
	this.price = price;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

}
