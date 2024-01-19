package com.mkpits.collection;

import java.util.ArrayList;

public class ArrayLIst3 {

	public static void main(String[] args) {
		ArrayList<Boolean> list=new ArrayList<Boolean>();
		list.add(true);
		list.add(false);
		list.add(false);
		list.add(true);
		
		for (Boolean b: list) {
			System.out.println(b);
		}

	}

}
