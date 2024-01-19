package com.mkpits.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interface2 implements Interface1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Interface2 t=new Interface2();
	    t.fName();
	    t.lName();
	    Interface1.fetchData();
	    t.addData();
	}
	
    
    
	@Override
	public void fName() {
		String fName="Vinay";
		System.out.println("First Name is :"+fName);
	}

	@Override
	public void lName() {
		String lName="Thaware";
		System.out.println("Last Name :"+lName);
		
	}

	@Override
	public void addData() throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a First Number");
		int num1=Integer.parseInt(br.readLine());
		System.out.println("Enter a Second Number");
		int num2=Integer.parseInt(br.readLine());
		System.out.println("Adddition is: "+num1+num2);
	    
		
		
	}

	@Override
	public void pinCode() {
		int pinCode=4440013;
		System.out.println("Pincode is : "+pinCode);
		
	}

}
