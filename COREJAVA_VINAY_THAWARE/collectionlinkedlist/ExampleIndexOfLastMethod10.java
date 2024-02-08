package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;

public class ExampleIndexOfLastMethod10 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Vinay");
		list.add("Raj");
		list.add("Sanket");
		list.add("Raj");
		list.add("Pranav");
		list.add("Sanket");
		
		
		System.out.println("First Index no:-"+list.indexOf("Raj"));

		System.out.println("Last Index no:"+list.lastIndexOf("Sanket"));
	}

}
