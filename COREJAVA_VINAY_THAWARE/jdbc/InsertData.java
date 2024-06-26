package com.mkpits.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class InsertData {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/emp","root","");  
			  
			PreparedStatement stmt=con.prepareStatement("insert into emp_table(Emp_Name,Emp_City,Salary)values(?,?,?)"); 
			
//			System.out.println("Enter Id:");
//			int id=Integer.parseInt(br.readLine());
//			stmt.setInt(1,id);//1 specifies the first parameter in the query  
			System.out.println("Enter Name:");
			String name=br.readLine();
			stmt.setString(1,name);
			System.out.println("Enter City:");
			String city=br.readLine();
			stmt.setString(2,city);
			System.out.println("Enter Salary:");
			int sal=Integer.parseInt(br.readLine());
			stmt.setInt(3,sal);
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted"); 
			
			
			
			  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  

	}


