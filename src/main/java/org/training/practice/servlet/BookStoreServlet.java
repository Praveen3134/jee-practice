package org.training.practice.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookstore")
public class BookStoreServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BookStoreServlet() {
	super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	RequestDispatcher dispatcher = request.getRequestDispatcher("AddBooks.html");
	dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	Book book = new Book();
	book.setAuthor(request.getParameter("author"));
	book.setDescription(request.getParameter("description"));
	book.setTitle(request.getParameter("title"));
	book.setPrice(Integer.parseInt(request.getParameter("price")));
	book.setImageURI(request.getParameter("imageURI"));
	BookStore.addBook(book);

//	RequestDispatcher dispatcher = request.getRequestDispatcher("AddBooks.html");
//	dispatcher.forward(request, response);
    }

}
