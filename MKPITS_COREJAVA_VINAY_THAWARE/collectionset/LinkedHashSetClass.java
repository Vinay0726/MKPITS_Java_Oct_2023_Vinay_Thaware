package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
//LinkedHashset-->Output Will be order..
	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<String>();
		set.add("Vinay");
		set.add("Raj");
		set.add("Sanket");
		set.add("Vinay");
		set.add("Pranav");
		
		System.out.println("Order Set:-");
		for (String name : set) {
			System.out.println(name);
		}
	}

}
