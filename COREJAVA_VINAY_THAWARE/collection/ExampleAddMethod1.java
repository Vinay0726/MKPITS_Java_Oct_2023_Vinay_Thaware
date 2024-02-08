package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ExampleAddMethod1 {
//Add -->It is use for adding Element But no replace.
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Vinay");
		list.add("Thaware");
		list.add(1,"C");
		
		System.out.println("Name:-"+list);
		System.out.println("-------------");
		//Joining the string using Delimeter
		StringJoiner join=new StringJoiner("@");
		join.add(list.get(0)).add(list.get(1)).add(list.get(2));
		System.out.println(join);
		System.out.println("--------------");
		System.out.println(list);

	}

}
