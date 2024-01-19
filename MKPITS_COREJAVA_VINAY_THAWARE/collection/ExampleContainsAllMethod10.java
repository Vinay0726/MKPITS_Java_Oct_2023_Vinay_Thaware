package com.mkpits.collection;

import java.util.ArrayList;

public class ExampleContainsAllMethod10 {
//The containsAll() method of List interface in Java is used to check if this List contains all of the elements in the specified Collection. 
//So basically it is used to check if a List contains a set of elements or not.
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Vinay");
		list.add("Raj");
		list.add("Sanket");
		list.add("Ashiq");
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Vinay");
		list1.add("Raj");

		//first list contains all Second list ..then true
		//It returns in boolean
		System.out.println("All Contains are there?"+list.containsAll(list1));
		

	}

}
