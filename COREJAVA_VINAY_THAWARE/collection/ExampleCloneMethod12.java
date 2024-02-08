package com.mkpits.collection;

import java.util.ArrayList;

public class ExampleCloneMethod12 {

	public static void main(String[] args) {
		
		ArrayList <Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		
		System.out.println(list);
		
		System.out.println("-----------------");
		
		list.clone();
		System.out.println(list);

	}

}
