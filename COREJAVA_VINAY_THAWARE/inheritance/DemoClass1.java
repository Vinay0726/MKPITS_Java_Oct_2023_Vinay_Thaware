package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoClass1 extends DemoClass {
	
	long mobile;
	char gender;
	int pinCode;
	
	public void getDetails() throws IOException {
		
		
	    getfName(fName);
		getlName(lName);
		getemail(email);
		getMobile(mobile);
		getGender(gender);
		getPincode(pinCode);
	}

	void getPincode(int pinCode) {
		this.pinCode=pinCode;
		System.out.println("Pincode:-"+pinCode);
	}

	void getGender(char gender) {
		this.gender=gender;
		System.out.println("Gender:-"+gender);
		
	}

	void getMobile(long mobile) {
		this.mobile=mobile;
		System.out.println("Mobile:-"+mobile);
		
	}

	 

	
}
    
