package com.mkpits.interfaces;

public abstract class Shape {
	String color;
	
	
	public abstract double area();
	public abstract String toString();
	
	
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color=color;
		
	}	
	
	public String getColor() {
		return color;
	}

}
