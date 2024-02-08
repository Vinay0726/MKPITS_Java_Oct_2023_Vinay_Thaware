package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class TypeSafety5 {
//Type safety -->If we have Integer we assign Integer value not other
	public static void main(String[] args) {
		Integer[]arr=new Integer[10];
		arr[0]=10;
		arr[1]=83;
//	    arr[2]="vinay"; //Compile time Error//
		
		Integer i=20;
		//instanceof -->If we have Integer then check Element in integer..
		//Return in Boolean
		System.out.println(i instanceof Integer); 
		
		//Non Generic->	Not TypeSafety--Return object
		List list=new ArrayList();
		list.add(23);
		list.add(true);
		list.add("Vinay");
		list.add(10.0);
		
		for (Object value : list) {
			System.out.println(value);
			
		}
		//Generic->Type Safety--If we have Integer type then we have to add int value
		List<Integer> list1=new ArrayList();
		list1.add(23);
		list1.add(62);
		//list.add("Vinay");//Compile time
		//list.add(10.0);
		
		
	}

}
