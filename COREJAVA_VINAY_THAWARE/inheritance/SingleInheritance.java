package com.mkpits.inheritance;

public class SingleInheritance {
//single inheritance=If subclass is created using only one super class
//create the object of Sub class because using object of sub class 
//we can access the members of both subclasss & Superclass.
//The sub class can access the attributes & method of its own as well as attributes & method of its Super Class
	public static void main(String[] args) {
		SubDemo call=new SubDemo();
		call.getAdd(20, 15);
		call.getSub();
		

	}


}
