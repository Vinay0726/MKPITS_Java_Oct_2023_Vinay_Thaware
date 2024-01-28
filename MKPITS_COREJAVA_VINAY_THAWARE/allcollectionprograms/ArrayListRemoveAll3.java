package com.mkpits.allcollectionprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAll3 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(6);
		list1.add(9);
		list1.add(5);
		list1.add(9);
		list.addAll(list1);
		list.removeAll(list1);
		System.out.println(list);
	}

}
