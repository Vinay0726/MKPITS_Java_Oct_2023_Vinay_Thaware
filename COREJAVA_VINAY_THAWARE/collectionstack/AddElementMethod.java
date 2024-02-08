package com.mkpits.collectionstack;

import java.util.Stack;

public class AddElementMethod {

	public static void main(String[] args) {
        Stack<Integer> list=new Stack<>();
	    
		
		list.add(3);
		list.add(2);
		list.add(8);
		list.add(9);
		
		list.addElement(7);
		System.out.println("After Add Element :"+list);
		
		list.addAll(list);
		System.out.println("After Add All:"+list);
	}

}
