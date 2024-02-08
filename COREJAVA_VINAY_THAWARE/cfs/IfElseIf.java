package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//If else if ladder
public class IfElseIf {
    static BufferedReader br;
	public static void main(String[] args) throws IOException {
	  br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a :");
		String userName=br.readLine();
		if(userName.equals("")) {
			System.out.println("Username Required");
		}
		System.out.println("Enter Password:");
		String password=br.readLine();
		
		if(password.equals("")) {
			System.out.println("Password Required");
		}
		if(userName.equals("Vinay")) {
			System.out.println("Username is :-"+userName);
		}
		else if (password.equals("vinay@123")) 
		{
			
			System.out.println("Password is :-"+password);
			System.out.println("Login Successful :)");
			
		}
			
		
		}
		

	}
