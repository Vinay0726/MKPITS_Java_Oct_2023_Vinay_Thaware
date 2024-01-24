package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
//Set ->Remove Duplicate Element ..
//      Output will be unordered ..
//      It Always Sorted order.
//      First insert value remove and second Element get.If Duplicate Element.
		Set<String> set=new HashSet<>();
		set.add("Vinay");
		set.add("Raj");
		set.add("Sanket");
		set.add("Vinay");
		set.add("Pranav");
		
		System.out.println(set);

	}

}
