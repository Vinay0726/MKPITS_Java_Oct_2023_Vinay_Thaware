package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class BooksDbUtil {
private DataSource dataSource;
	
	public BooksDbUtil(DataSource dataSource) {
		this.dataSource=dataSource;
}
	public List<Books_Model> getBooks()throws Exception  {
		List<Books_Model> books=new ArrayList<>();
		//get connection to the database
				Connection myConn=null;
				Statement myStmt=null;
				ResultSet myRs=null;
				try {
					myConn=dataSource.getConnection();
					
					//create sql statement
					String sql="select * from books order by id";
					myStmt=myConn.createStatement();
					//execute sql query
					myRs=myStmt.executeQuery(sql);
					
					//process the result set
					while(myRs.next()) {
						int id=myRs.getInt("id");
						String title=myRs.getString("title");
						String author=myRs.getString("author");
						String date=myRs.getString("date");
						String genres=myRs.getString("genres");
						String chracters=myRs.getString("characters");
						String synopsis=myRs.getString("synopsis");
						
					    //create new Student object
						Books_Model tempBooks=new Books_Model(id, title, author, date, title, author, date);
						//add it to list of the student
						books.add(tempBooks);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					//close jdbc object
					close(myConn,myStmt,myRs);
				}
				return books;
	}
	
	       private void close(Connection myConn,Statement myStmt,ResultSet myRs) {
		try {
			if(myRs != null) {
				myRs.close();
			}if(myStmt != null) {
				myStmt.close();
			}
			if(myConn != null) {
				myConn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	
}
