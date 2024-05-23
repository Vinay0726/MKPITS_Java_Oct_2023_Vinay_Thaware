package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/emp","root","");  
			  
			PreparedStatement stmt=con.prepareStatement("update emp_table set Emp_Name=?,Emp_City=?,Salary=? where Emp_id=?");  
			
			stmt.setString(1, "Raju");//1 specifies the first parameter in the query i.e. name  
		    stmt.setString(2, "Pune");
		    stmt.setInt(3, 18000);
		    stmt.setInt(4, 1);
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated"); 
			  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  

	}


