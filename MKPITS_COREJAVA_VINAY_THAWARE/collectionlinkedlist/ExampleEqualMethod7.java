package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;
import java.util.List;

public class ExampleEqualMethod7 {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		list.add(3);
		list.add(2);
		list.add(8);
		list.add(1);
		list.add(6);
		
		List<Integer> list1=new LinkedList<>();
		list1.add(3);
		list1.add(2);
		list1.add(8);
		list1.add(1);
		list1.add(6);
		
		//	Compare Object Same In list 1 and list 2 then Print True
		System.out.println(list.equals(list1));
		
		
	}

}
