package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;

public class ExampleAddFirstLastMathod2 {

	public static void main(String[] args) {
		
		LinkedList<String> name=new LinkedList();
		name.add("vinay");
		name.add("raj");
		name.add("Sanket");
		
		
		System.out.println("Initail List:"+name);
		
		name.addFirst("Ashiq");
		System.out.println("After AddFirst Method:"+name);
		
		name.addLast("Pranav");
		System.out.println("After AddLast Method:"+name);
		
	}

}
