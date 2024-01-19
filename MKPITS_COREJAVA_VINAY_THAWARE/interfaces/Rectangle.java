package com.mkpits.interfaces;

public class Rectangle extends Shape {
   double width,length;
   
   public Rectangle(String color, double length, double width) {
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is " + super.getColor() + "and area is : " + area();
	}
	
}
