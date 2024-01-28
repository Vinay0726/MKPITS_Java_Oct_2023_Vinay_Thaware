package com.mkpits.allcollectionprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGet9 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		//index
		System.out.println(list.get(1));
		
		System.out.println(list.getClass());

	}

}
