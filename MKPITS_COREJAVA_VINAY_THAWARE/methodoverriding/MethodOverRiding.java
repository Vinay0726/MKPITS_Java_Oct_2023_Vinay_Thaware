package com.mkpits.methodoverriding;

public class MethodOverRiding {
	//Method Overriding :- one reference variable overriding we can call two or more method
	// method accessibility,return type,method name,types of arguments,no.of argument 
	//& sequence of arguments all must be same.
	//we can hide implementation details of super class method in sub class.
	//Single Object can construct.
	//if we have super & sub class we can use one reference object.
	//It is use to implement dynamic/run time/late binding PolyMorphism in java.
	public static void main(String[] args) {
		
		Rectangle obj;
		obj=new Rectangle();
		obj.getData(10, 20);
		obj.area();
		obj=new Triangle();
		obj.getData(10, 20);
		obj.area();
	}

}
