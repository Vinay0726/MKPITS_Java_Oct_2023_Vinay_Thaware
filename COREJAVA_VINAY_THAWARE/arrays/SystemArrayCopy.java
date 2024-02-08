package com.mkpits.arrays;

import java.util.Arrays;

public class SystemArrayCopy {

	public static void main(String[] args) {
		String name[]= {"vinay","raj","ashik","harsh","sanket","pranav"};
		String newName[]=new String[5];
		//System.array.copy(object src,int srcPos,object Des,int desPos,int length);
		System.arraycopy(name, 0,newName, 0, 5);
	     
		//for each loop
	  for (String s : newName) {
		System.out.println(s);
	}


	}

}
