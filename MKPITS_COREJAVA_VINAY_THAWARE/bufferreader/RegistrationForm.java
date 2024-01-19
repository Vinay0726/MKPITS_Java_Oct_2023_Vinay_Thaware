package com.mkpits.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegistrationForm {

	public static void main(String[] args)throws IOException {
		RegistrationForm r=new RegistrationForm();
		r.getFName();
		r.getLName();
		r.getAge();
		r.getGender();
		r.getState();
		r.getCity();
		r.getPincode();
		r.getMobile();
		r.getEmail();
		r.getPassword();

	}
    
	public void getPassword() throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Password:");
		String password=r.readLine();
		System.out.println("Password:"+password);
		
	}

	public void getEmail() throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Email:");
		String email=r.readLine();
		System.out.println("Email:"+email);
		
	}
	private void getMobile() throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Mobile Number:");
		long mobile=Long.parseLong(r.readLine());
		System.out.println("Mobile no:"+mobile);
		
	}

	public void getPincode() throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Pincode:");
		 int pincode=Integer.parseInt(r.readLine());
		System.out.println("First Name:"+pincode);
		
	}

	public void getCity() throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter City Name:");
		String city=r.readLine();
		System.out.println("City:"+city);
		
	}

	public void getState() throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter State Name:");
		String state=r.readLine();
		System.out.println("State:"+state);
		
	}
	private void getGender() throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Gender:");
		//typecasting
		char gender=(char)r.read();
		System.out.println("State:"+gender);
		
		
	}

	public void getAge() throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Age:");
		int age=Integer.parseInt(r.readLine());
		System.out.println("Age:"+age);
		
	}

	public void getLName() throws IOException {
		//input stream by making new object
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader r=new BufferedReader(input);
		System.out.println("Enter Last Name:");
		String lName=r.readLine();
		System.out.println("Last Name:"+lName);
		
	}

	public void getFName() throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Name:");
		String fName=r.readLine();
		System.out.println("First Name:"+fName);
		
		
	}

}
