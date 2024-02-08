package com.mkpits.userdefined;

public class StaticVariableClass2 {
	static String lName="Thaware";
	public static void main(String[] args) {
		 
		System.out.println("Last name :"+lName);
//		new ClassName().variableName
		System.out.println("First name :"+new StaticVariableClass1().fName);

	}

}
