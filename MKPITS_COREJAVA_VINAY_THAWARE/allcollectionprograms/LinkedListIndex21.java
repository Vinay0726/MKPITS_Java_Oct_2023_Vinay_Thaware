package com.mkpits.allcollectionprograms;

import java.util.LinkedList;

public class LinkedListIndex21 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(1);
		
	
		System.out.println(list.indexOf(4));
		System.out.println(list.lastIndexOf(1));

	}

}
