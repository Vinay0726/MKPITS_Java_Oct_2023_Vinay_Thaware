package com.mkpits.allcollectionprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdd1 {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		list.add(2, 5);
		
		System.out.println(list);

	}

}
