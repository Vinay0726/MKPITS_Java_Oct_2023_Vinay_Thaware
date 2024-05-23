package com.mkpits.demo;

public class NestedTry {

	public static void main(String[] args) {
		//outer try block
		try {
			//lines
			try {
				//handle exception
				System.out.println("number divide by zero");
				int num=10/0; 
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			
		}

	}

}
