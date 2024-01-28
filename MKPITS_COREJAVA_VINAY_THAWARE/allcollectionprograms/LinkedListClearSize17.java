package com.mkpits.allcollectionprograms;

import java.util.LinkedList;

public class LinkedListClearSize17 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		 System.out.println(list.size());
		 
		 list.clear();
		 System.out.println(list);
	}

}
