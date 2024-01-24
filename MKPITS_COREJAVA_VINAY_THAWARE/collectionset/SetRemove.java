package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class SetRemove {

	public static void main(String[] args) {
		
		Set<String> name=new HashSet<String>();
		name.add("Vinay");
		name.add("Raj");
		name.add("Sanket");
		name.add("Regved");
		name.add("Ashiq");
		
		System.out.println("Before Removing:-"+name);
		name.remove("Regved");
		System.out.println("After Removing:-"+name);
		

	}

}
