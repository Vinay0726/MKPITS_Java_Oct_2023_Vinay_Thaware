package com.mkpits.inheritance;

public class DemoClass {
	String fName,lName,email;
	

    void getemail(String email) {
		this.email=email;
		System.out.println("Email:-"+email);
		
	}


	void getlName(String lName) {
		this.lName=lName;
		System.out.println("Last Name:-"+lName);
		
	}


	void getfName(String fName) {
		this.fName=fName;
		System.out.println("First Name:-"+fName);
		
	}
	
	
}
