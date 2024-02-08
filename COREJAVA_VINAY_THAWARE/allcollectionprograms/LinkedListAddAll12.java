package com.mkpits.allcollectionprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAddAll12 {

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
		
		System.out.println(list);

	}

}
