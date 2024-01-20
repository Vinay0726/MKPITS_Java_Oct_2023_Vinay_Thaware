package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;

public class ExamplePeekFirstLastMethod12 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Vinay");
		list.add("Raj");
		list.add("Sanket");
		list.add("Raj");
		list.add("Pranav");
		list.add("Sanket");
		System.out.println("Peek First Element:"+list.peekFirst());
		System.out.println("Peek Last Element:"+list.peekLast());
	}

}
