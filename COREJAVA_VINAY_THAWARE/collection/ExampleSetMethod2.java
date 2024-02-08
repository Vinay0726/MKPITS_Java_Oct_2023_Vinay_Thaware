package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleSetMethod2 {
//Set-->It is used to Update data(Replace)...
	public static void main(String[] args) {
		
		List<String> city=new ArrayList<String>();
		//Adding Element in List
		city.add("Nagpur");
		city.add("City");
		//Adding Element with using Index
		city.add(1, "Is");
		System.out.println("Initial Element In List");
		System.out.println(city);
		System.out.println("-------------");
		//set(index,"Element")
		city.set(0, "Mumbai");
		System.out.println("Updated  Element In List");
		System.out.println(city);

	}

}
