package com.mkpits.arrays;

import java.util.Arrays;

public class CopyOfRange {

	public static void main(String[] args) {
		String name[]= {"vinay","raj","ashik","harsh","sanket","pranav"};
		//Array.copyOfRange(original,int from,int to);
		//start from-to
		String newName[]=Arrays.copyOfRange(name, 0, 4);
		
		//for each loop
		for (String uName : newName) {
			System.out.println(uName);
			
		}

	}

}
