package com.mkpits.collectionstack;

import java.util.Stack;

public class StackSearchMethod4 {
//Search->It determines whether an object exists in the stack. 
//If the element is found,It returns the position of the element from the top of the stack.
//Else, it returns -1.
// This method starts the count of the position from 1 and not from 0.
	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		list.push(2);
		list.push(6);
		list.push(3);
		list.push(9);
		
		
		System.out.println("Search index using object:"+list.search(6));
		
		System.out.println("Search index using object:"+list.search(9));

	}

}
