package com.mkpits.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegistrationGlobalVariable {
    String fName,lName,city,email,password,cPassword,gender;
    int age,pincode;
    long mobile;
	public static void main(String[] args) throws IOException {
		RegistrationGlobalVariable rg=new RegistrationGlobalVariable();
		rg.registration();

	}
	public void registration() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter First Name:");
		this.fName=br.readLine();
		System.out.println("Enter Last Name:");
		this.lName=br.readLine();
		System.out.println("Enter Your Age:");
		//typecasting
		this.age=Integer.parseInt(br.readLine());
		System.out.println("Enter Your Gender:");
		this.gender=br.readLine();
		System.out.println("Enter City:");
		this.city=br.readLine();
		System.out.println("Enter Pincode:");
		//typecasting
		this.pincode=Integer.parseInt(br.readLine());
		System.out.println("Enter Mobile:");
		//typecasting
		this.mobile=Long.parseLong(br.readLine());
		System.out.println("Enter Email:");
		this.email=br.readLine();
		System.out.println("Enter Password:");
		this.password=br.readLine();
		System.out.println("Enter Confirm Password:");
		this.cPassword=br.readLine();
		
	}

}
