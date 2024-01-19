package com.mkpits.interfaces;

import java.io.IOException;
//Interface :- Interface is similar to a class except that is does not contain any implementation.
//interface are 100% abstract.
//members(variables & methods) of interface are by default public.
//The interface service(methods)can be override or use by any classes.
//we can not declare variables if we want to declare then we have to make non static variable.
//By default members of interface are public.
public interface Interface1 {
	void fName();
	void lName();
	void addData() throws NumberFormatException, IOException;
	void pinCode();
	static void fetchData() {
		
		System.out.println("hello");
		
	}
}
