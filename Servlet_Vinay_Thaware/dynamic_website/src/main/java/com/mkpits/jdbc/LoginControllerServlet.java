package com.mkpits.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
 * Servlet implementation class LoginControllerServlet
 */
@WebServlet("/LoginControllerServlet")
public class LoginControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private LoginDbUtil loginsDbutil;
	@Resource(name = "jdbc/loginregister")
	private DataSource dataSource;

	public void init() throws ServletException {
		super.init();
		// create login db util ..and pass int the conn pool / dataSource
		try {
			loginsDbutil = new LoginDbUtil(dataSource);
		} catch (Exception exe) {
			throw new ServletException(exe);
		}
	}
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		addUser(request, response);
				
	}

	
	private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read student data form

				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String gender = request.getParameter("gender");
				String city = request.getParameter("city");
				long mobile =Long.parseLong(request.getParameter("mobile"));
				String uname = request.getParameter("uname");
				String password = request.getParameter("password");

				// create new Student_Model object

				Login_Model theLogin = new Login_Model(name, email, gender, city, mobile, uname, password);
				// add student to the database
				loginsDbutil.addUsers(theLogin);
                
				RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
				dispatcher.forward(request, response);
				
				
		
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//for login
		
		try {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginregister","root","");
			String n=request.getParameter("uname");
			String p=request.getParameter("password");
			PreparedStatement ps=conn.prepareStatement("select uname from register where uname=? and password=?");
			ps.setString(1, n);
			ps.setString(2, p);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				
				RequestDispatcher rd=request.getRequestDispatcher("index.html");
				rd.forward(request, response);
			}else {
				out.println("Login Failed");
			}
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
