package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfStatement {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Username:");
		String uName=br.readLine();
		
		System.out.println("Enter Password:");
		String password=br.readLine();
		if(uName.equals("")) {
			System.out.println("Username Required");
		}
		if(password.equals("")) {
			System.out.println("Password Required");
		}
		
		
		
		if(uName.equals("Vinay")||(password.equals("Vinay@123"))) {
			System.out.println("Login Successful :)");
        }
		
		
		System.out.println("Enter a value:");
		int num1=Integer.parseInt(br.readLine());
		if(num1>10) {
			System.out.println("This number greater than 10");
			
}
}
}
