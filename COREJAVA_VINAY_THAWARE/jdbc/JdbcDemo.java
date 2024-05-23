package com.mkpits.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/emp","root","");  
			  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp_table");  
			while(rs.next())  
			System.out.println("Id: "+rs.getInt(1)+" Name: "+rs.getString(2)+" City: "+rs.getString(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  

	

}
