package com.mkpits.allcollectionprograms;

import java.util.LinkedList;

public class LinkedListGet19 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		System.out.println(list.get(0));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
        System.out.println(list.getClass());
	}

}
