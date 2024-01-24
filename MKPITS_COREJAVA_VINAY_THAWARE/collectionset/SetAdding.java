package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class SetAdding {

	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<String>();
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("A");
		set.add("D");
		
		//It will be a Sorted Order
		System.out.println("After Adding Element:-");
		System.out.println(set);


		



	}

}
