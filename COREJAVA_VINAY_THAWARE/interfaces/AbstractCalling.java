package com.mkpits.interfaces;

public class AbstractCalling {
//Abstract -With using Abstract keyword //its is use for Hide Implementation//with use of inheritance.
//It is only for declaration //Functionality show implementation hide.
//Internally works not know function(hide). eg-car internal function hide.
// if non static class then then we not use abstract keyword. 
//if we have class with abstract keyword method will be use abstract keyword.
//after java 8 we can give method body.

	public static void main(String[] args) {
		
		Shape s1 = new Circle("Blue", 4.4);
		Shape s2 = new Rectangle("Green", 3.1, 2.1);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

	}


