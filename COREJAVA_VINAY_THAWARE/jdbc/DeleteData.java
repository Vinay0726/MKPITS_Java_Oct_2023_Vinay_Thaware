package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/emp","root","");  
			  
			PreparedStatement stmt=con.prepareStatement("delete from emp_table where Emp_Id=?");  
			stmt.setInt(1,1);  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records deleted");  
			  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  

	}


