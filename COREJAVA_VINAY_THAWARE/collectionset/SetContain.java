package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class SetContain {

	public static void main(String[] args) {
		//Contain->Accessing Element...Contains are there or not...
		Set<String> set=new HashSet<String>();
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("A");
		set.add("D");
		
		//It will be a Sorted Order
		System.out.println("After Adding Element:-");
		System.out.println(set);
		
		System.out.println("Contains E:-"+set.contains("E"));
		
		String check="A";
		System.out.println("A Element Contains Are There?"+set.contains(check));

		
	}

}
