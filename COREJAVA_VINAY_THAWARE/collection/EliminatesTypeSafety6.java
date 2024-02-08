package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class EliminatesTypeSafety6 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		Integer[] intArr = new Integer[10];
		intArr[0] = 10;
		//If we add in 0 index size wil be 10 its takes all size
		int v = intArr[0];

		System.out.println(intArr.length);

		// In Non Generic version wehave to typecast
		ArrayList list = new ArrayList();
		list.add(10);
		int v1 = (Integer) list.get(0);// returns object and object cant assign to primitive datatype directly

		list.add("mkpits");
		String str = (String) list.get(1);

		// Generic version no need to typecast
		ArrayList<Double> doubleArr = new ArrayList<Double>();
		doubleArr.add(23.78);
		double d = doubleArr.get(0);
		//FIFO only one add then next in list second index..Its takes only one after other..
		System.out.println(doubleArr.size());
	}

}
