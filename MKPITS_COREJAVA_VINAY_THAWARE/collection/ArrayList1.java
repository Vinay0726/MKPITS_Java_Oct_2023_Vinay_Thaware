package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Double> list=new ArrayList<Double>();
		list.add(19.2);
		list.add(32.2);
		list.add(12.2);
		list.add(32.12);
		
		for (Double num : list) {
			System.out.println("Double :-"+num);
		}

	}

}
