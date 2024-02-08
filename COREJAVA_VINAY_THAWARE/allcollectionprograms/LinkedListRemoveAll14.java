package com.mkpits.allcollectionprograms;

import java.util.LinkedList;

public class LinkedListRemoveAll14 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		 LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(6);
		list1.add(9);
		list1.add(5);
		list1.add(9);
		
		list.addAll(list1);
		list.removeAll(list1);
		System.out.println(list);

	}

}
