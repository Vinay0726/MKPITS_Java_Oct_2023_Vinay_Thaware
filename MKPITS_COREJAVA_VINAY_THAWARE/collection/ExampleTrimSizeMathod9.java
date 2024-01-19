package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleTrimSizeMathod9 {
//TrimToSize -> trims the capacity of an ArrayList instance to be the ArrayList current size.
//This method is used to trim an Vector instance to the number of elements it contains. 
//It does not returns any value. It trims the capacity of this Vector instance to the number of the element it contains.	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("3");
		list.add("Vinay");
		list.add("2");
		list.add("Mkpits");
		list.add("5");
		
		System.out.println(list);
		
		System.out.println("Initial Size :"+list.size());
		
		list.trimToSize();
		System.out.println("Size After Trim :"+list.size());
		
		
		 
		
		 
		 
		 
	}

}
