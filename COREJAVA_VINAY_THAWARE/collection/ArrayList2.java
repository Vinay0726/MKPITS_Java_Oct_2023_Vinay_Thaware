package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
		List<Character> list=new ArrayList<>();
		list.add('v');
		list.add('i');
		list.add('n');
		list.add('a');
		list.add('y');
		
		for (Character alp : list) {
			System.out.println(alp);
		}
	}

}
