package com.mkpits.demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("vinay");
		list.add("raj");
		list.add("sanket");
		
		list.set(1, "Chetan");
		System.out.println(list);
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("pranav");
		list1.add("vaibhav");
		list1.add("kaustub");
		
		list.addAll(list1);
		
		
		System.out.println(list);
		ArrayList<String> result =new ArrayList<>();
		result.addAll(list);
		result.addAll(list1); 
		System.out.println(result);
		
		
	}

}
