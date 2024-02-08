package com.mkpits.bufferreader;

import java.io.IOException;

public class CallRgGlobal {

	public static void main(String[] args) throws IOException {
		RegistrationGlobalVariable call=new RegistrationGlobalVariable();
		call.registration();
		
		System.out.println("First Name is:-"+call.fName);
		System.out.println("Last Name is:-"+call.lName);
		System.out.println("First Age is:-"+call.age);
		System.out.println("Gender is:-"+call.gender);
		System.out.println("City is:-"+call.city);
		System.out.println("Pincode is:-"+call.pincode);
		System.out.println("Mobile no is:-"+call.mobile);
		System.out.println("Email is:-"+call.email);
		System.out.println("Password is:-"+call.password);
		System.out.println("Confirm Password is:-"+call.cPassword);
		if(call.password.equals(call.cPassword)) {
		System.out.println("------------------");
		System.out.println("Login Successful :)");
	}
		else {
			System.out.println("Login Failed :(");
		}
	}

	}
