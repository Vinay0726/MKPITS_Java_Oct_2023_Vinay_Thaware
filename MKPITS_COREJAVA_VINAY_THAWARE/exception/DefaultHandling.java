package com.mkpits.exception;

public class DefaultHandling {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		int num1=10,num2=0;
		//RunTime Exception//Unchecked Exception/
		//If having first  Exception then next code not run (Code break)
		//array having 0-4 that is why not print 5 
	//	System.out.println(arr[5]);//ArrayIndexOutOfBound
		System.out.println(num1/num2);//AirthmeticException
	}

}
