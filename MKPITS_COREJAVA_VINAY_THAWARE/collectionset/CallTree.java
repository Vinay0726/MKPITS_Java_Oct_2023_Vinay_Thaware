package com.mkpits.collectionset;

public class CallTree {

	public static void main(String[] args) {
		ExampleTree student=new ExampleTree("Student :-");
		ExampleTree male=new ExampleTree("Male");
		ExampleTree female=new ExampleTree("Female");
		
		ExampleTree vinay=new ExampleTree("vinay");
		ExampleTree sanket=new ExampleTree("Sanket");
		ExampleTree raj=new ExampleTree("Raj");
		ExampleTree pranav=new ExampleTree("Pranav");
		ExampleTree samikshaP=new ExampleTree("Samiksha P");
		ExampleTree samikshaD=new ExampleTree("Samiksha D");
	
		
		student.addChild(male);
		student.addChild(female);
		
		male.addChild(vinay);
		male.addChild(sanket);
		male.addChild(raj);
		male.addChild(pranav);
		
		female.addChild(samikshaP);
		female.addChild(samikshaD);
		
		System.out.println(student.print(0));
		
	}

}
