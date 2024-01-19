package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.filechooser.FileNameExtensionFilter;

public class callSingleInheritance {

	public static void main(String[] args) throws IOException {
		
		DemoClass1 call=new DemoClass1();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		
		System.out.println("Enter First Name");
		call.fName=br.readLine();
		while(call.fName.isEmpty()) {
			System.out.println("Invalid first name !!");
			System.out.println("Enter First Name");
			call.fName=br.readLine();
		}
		
		System.out.println("Enter Last Name");
		call.lName=br.readLine();
		while(call.lName.isEmpty()) {
			System.out.println("Invalid last name !!");
			System.out.println("Enter Last Name");
			call.lName=br.readLine();
		}
		
		System.out.println("Enter Email");
		call.email=br.readLine();
		while(call.email.isEmpty()) {
			System.out.println("Invalid emai !!");
			System.out.println("Enter Last Name");
			call.email=br.readLine();
		}
		//Regular Expression  
		String regex="^(.+)@(.+)$";
		//Compile regular expression to get the pattern 
		Pattern pattern=Pattern.compile(regex);
		//Create instance of matcher 
		Matcher matcher=pattern.matcher(call.email);	
		while(!matcher.matches()) {
		    System.out.println("Email invalid");
		    System.out.println("Enter email :-");
		    call.email=br.readLine();
				}
		
		System.out.println("Enter Mobile");
		call.mobile=Long.parseLong(br.readLine());
		while(call.mobile<=10) {
			System.out.println("Mobile no is invalid");
			System.out.println("Enter Mobile :-");
			call.mobile=Long.parseLong(br.readLine());
		}
		
		System.out.println("Enter Gender");
		call.gender=(char)br.read();
		br.readLine();
		
		System.out.println("Enter Pincode");
		call.pinCode=Integer.parseInt(br.readLine());

		System.out.println("-----------------------------");
		System.out.println("      Student Information :) ");
		call.getDetails();
		System.out.println("-----------------------------");
	    }	
}
