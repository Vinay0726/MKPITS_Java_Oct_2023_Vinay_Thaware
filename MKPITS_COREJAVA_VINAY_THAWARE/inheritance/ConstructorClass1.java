package com.mkpits.inheritance;

public class ConstructorClass1 {

	int x=20;
	
	public ConstructorClass1() {
		System.out.println("Default Constructor :-"+x);
	}
	public ConstructorClass1(int x1) {
		int x=x1;
		System.out.println("Parameterized constructor is:-"+x);
	}
}
