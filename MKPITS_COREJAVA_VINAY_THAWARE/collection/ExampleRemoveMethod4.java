package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleRemoveMethod4 {
//Remove -->Remove the Element
	public static void main(String[] args) {
		
		List<String> city=new  ArrayList<String>();
		//Adding Element in List
		city.add("Nagpur");
	    city.add("City");
	    //Adding Element with using Index
	    city.add(1, "Is");
		System.out.println("Initial Element In List");
	    System.out.println(city);
	    
	    System.out.println("---------");
	    System.out.println("After Removing Element In List");
	    //Remove element with using index ...
	    city.remove(1);
	    System.out.println(city);
	    
	    //Remove Element using Object
	    //If having Same name in List then remove First
	    city.remove("City");
	    System.out.println(city);
	    
	      
	}

}
