package com.mkpits.collection;

import java.util.ArrayList;

public class PrintBothArray3 {

	public static void main(String[] args) {
	///Bounded
	 Integer[]arr= {10,22,23,32};
	 PrintIntegerArray1 array1=new PrintIntegerArray1();
	 array1.print(arr);
	 
	 System.out.println("----------");
	 String []arr1= {"Raj","Vinay","Sanket","Ashiq","Sanket"};
	 PrintStringArray2 array2=new PrintStringArray2();
	 array2.print(arr1);
	 
	 System.out.println("-----------");
	 Double []arr2= {102.2,12.3,123.2,12.23};
	 PrintDoubleArray arr3=new PrintDoubleArray();
	 arr3.print(arr2);
		
	}

}
