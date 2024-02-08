package com.mkpits.collectionstack;

import java.util.Stack;

public class ToArrayMethod {

	public static void main(String[] args) {
		
		Stack<Integer> list=new Stack<>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(8);
		
		System.out.println("Before List:"+list);
		
		Object[]arr=list.toArray();
     	for (int i = 0; i < list.size(); i++) {
			System.out.println("After ToArray:"+arr[i]);
     	}
		
	}

}
