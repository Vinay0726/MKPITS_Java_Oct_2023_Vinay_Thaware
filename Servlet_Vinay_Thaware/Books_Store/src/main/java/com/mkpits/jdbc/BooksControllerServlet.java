package com.mkpits.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class BooksControllerServlet
 */
@WebServlet("/BooksControllerServlet")
public class BooksControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private BooksDbUtil booksDbutil;
	@Resource(name="jdbc/bookstore")
	private DataSource dataSource;

	public void init() throws ServletException{
		super.init();
		//create student db util ..and pass int the conn pool / dataSource
		try {
			booksDbutil=new BooksDbUtil(dataSource);
		}catch(Exception exe){
		  throw new ServletException(exe);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			listBooks(request,response);
		}catch(Exception e) {
			throw new ServletException();
		}
	}
	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//get student from db util
		List<Books_Model> books=booksDbutil.getBooks();
		//add student to the request
		request.setAttribute("BOOKS_LIST", books);
		//send to JSP page view
		RequestDispatcher dispatcher=request.getRequestDispatcher("/list-books.jsp");
		dispatcher.forward(request, response);
		
	}
	}


