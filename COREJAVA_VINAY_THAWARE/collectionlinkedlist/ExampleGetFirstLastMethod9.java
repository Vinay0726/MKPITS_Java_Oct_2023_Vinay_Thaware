package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;

public class ExampleGetFirstLastMethod9 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(9);
		
		
		System.out.println("2nd Index Element:-"+list.get(2));
		
		System.out.println("Get First Index Element:-"+list.getFirst());

		System.out.println("Get Last Index Element:-"+list.getLast());
		
		System.out.println("Get ClassName:-"+list.getClass());
		
	
	}

}
