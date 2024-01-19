package com.mkpits.inheritance;

public class MultilevelInheritance {
// grandfather=father=child
// Super =Intermediate= superclass Subclass
//If subclass is created using an existing Sub class.
//This type of inheritance is called Multilevel Inheritance.
//The existing sub class is called Intermediates Superclass.
//The sub class can access the members of its own and members of intermediates super class and members of Top level super class.
	public static void main(String[] args) {
	MultiDemo m=new MultiDemo();
	m.getAdd(15,10);
	m.getSub();
	m.getMul();

	}

}
