package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;

public class ExampleContainsAllMethod4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		
		LinkedList<Integer> list1=new LinkedList<>();
		list.add(4);
		list.add(5);
		
		
		System.out.println("After Contain:"+list.contains(4));
		
		
		System.out.println("After Contains All:"+list.containsAll(list1));
	}

}
