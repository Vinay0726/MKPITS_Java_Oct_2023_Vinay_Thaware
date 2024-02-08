package com.mkpits.inheritance;

public class ConstructorClass2 extends ConstructorClass1 {

	int x=50;
	
	ConstructorClass2(){
		
		super();//if do not write super O/P same.
		System.out.println("Default Constructor is :-"+x);
	}
	ConstructorClass2(int x1){
		super(x1);// do not  give args & do not write super.
		System.out.println("Parameterized Constructor is:-"+x1);
	}
	
}
