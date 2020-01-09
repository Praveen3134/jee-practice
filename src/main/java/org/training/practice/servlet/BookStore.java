package org.training.practice.servlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore {

    private static Map<String, Book> bookCatalog = new HashMap<String, Book>();

    public static void addBook(Book book) {
	bookCatalog.put(book.getIsbn(), book);
    }

    public static Book getBook(String isbn) {
	return bookCatalog.get(isbn);
    }

    public static List<Book> getItems() {
	return new ArrayList<Book>(bookCatalog.values());
    }
}
