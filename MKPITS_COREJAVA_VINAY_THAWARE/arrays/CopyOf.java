package com.mkpits.arrays;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
		
		
	  String name[]= {"vinay","raj","ashik","harsh","sanket","pranav"};
	  // Array.copyOf(original,new length)
	  //it start from 0
		String[]newName=Arrays.copyOf(name, 3);
		//for each loop
		for (String n : newName) {
			System.out.println(n);
		}
      
	}

}
