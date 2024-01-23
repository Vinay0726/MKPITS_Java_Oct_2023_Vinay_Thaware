package com.mkpits.collectionstack;

import java.util.Stack;

public class ContainsAllMethod {

	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(8);
		
		Stack<Integer> list1=new Stack<>();
		list1.add(7);
		list1.add(2);
		list1.add(0);
		list1.add(8);
		//Same Element will be remove..
		//list.addAll(list1);
	//If Element Contains then true ...
		System.out.println(list.containsAll(list1));
		

	}

}
