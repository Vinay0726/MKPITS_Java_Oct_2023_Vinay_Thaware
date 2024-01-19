package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleGetMethod5 {
//Get-->Using Index get The Element in List
	public static void main(String[] args) {
	 List<String> nam=new ArrayList<String>();
	 nam.add("Vinay");
	 nam.add("Raj");
	 nam.add("Sanket");
	 nam.add("Ashiq");
	 //obj.get(index)
	 String firstName=nam.get(0);
	 String secondName=nam.get(1);
	 String thirdName=nam.get(2);
	 String fourthName=nam.get(3);
	 
	 System.out.println("1)"+firstName);
	 System.out.println("2)"+secondName);
	 System.out.println("3)"+thirdName);
	 System.out.println("4)"+fourthName);
	 
	 System.out.println("---------");
	 System.out.println(nam);
	 //Equals Method-->It Return Boolean...
	 System.out.println(nam.get(0).equals("Vinay"));
	 
	 boolean result=nam.get(1).equals("Raj");
	 System.out.println(result);
	 
	 
	 

	}

}
