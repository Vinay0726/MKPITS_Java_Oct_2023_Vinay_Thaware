package com.mkpits.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.sql.DataSource;

public class LoginDbUtil {

private  DataSource dataSource;
	
	public LoginDbUtil(DataSource dataSource) {
		this.dataSource=dataSource;
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
	public void addUsers(Login_Model theLogin) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			
			// get db connection
			myConn = dataSource.getConnection();

						// create sql for insert
					String sql = "insert into register(name,email,gender,city,mobile,uname,password) values(?,?,?,?,?,?,?)";
						myStmt = myConn.prepareStatement(sql);

						// set the param values for the student
						myStmt.setString(1, theLogin.getName());
						myStmt.setString(2, theLogin.getEmail());
						myStmt.setString(3, theLogin.getGender());
						myStmt.setString(4, theLogin.getCity());
						myStmt.setLong(5, theLogin.getMobile());
						myStmt.setString(6, theLogin.getUname());
						myStmt.setString(7, theLogin.getPassword());
						
                          
						// execute SQL insert
						myStmt.execute();
						
						
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						close(myConn, myStmt, null);
					}
		
		
	}

}
