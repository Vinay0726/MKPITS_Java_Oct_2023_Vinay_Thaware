package com.mkpits.userdefined;

public class StaticVariableClass3 {
	 static String myEmail="vinaythaware@gmail.com";
	public static void main(String[] args) {
		
		System.out.println("Email :"+myEmail);
		System.out.println("First name :"+new StaticVariableClass1().fName);
		System.out.println("Last name :"+new StaticVariableClass2().lName);


	}

}
