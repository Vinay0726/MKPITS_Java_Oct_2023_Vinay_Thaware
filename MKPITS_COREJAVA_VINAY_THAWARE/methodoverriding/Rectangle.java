package com.mkpits.methodoverriding;

public class Rectangle {
    int w,h;
    
    
    
   public void getData(int w,int h) {
    	
    	this.w=w;
    	this.h=h;
    }
    
    public void area () {
    	int a=w*h;
    	System.out.println("Area of Rectangle is :-"+a);
    }
    
}
