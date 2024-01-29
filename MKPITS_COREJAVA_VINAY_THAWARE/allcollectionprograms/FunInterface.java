package com.mkpits.lambdaexpression;

public interface FunInterface {
	
	//Abstract Method
    void abstactInterface(int x);
    //Default Method(non abstract method)
    default void defaultInterface() {
    	System.out.println("Hello.....");
    }
    
}
