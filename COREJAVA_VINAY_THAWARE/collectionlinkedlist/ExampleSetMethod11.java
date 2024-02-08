package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;

public class ExampleSetMethod11 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Vinay");
		list.add("Raj");
		list.add("Sanket");
		list.add("Raj");
		list.add("Pranav");
		list.add("Sanket");
		
		list.set(3, "Vaibhav");
		list.set(5, "Chetan");
		System.out.println("Size:"+list.size());
		System.out.println("After Set List:"+list);
		
		
		
	}

}
