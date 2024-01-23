package com.mkpits.collectionstack;

import java.util.Stack;

public class StackPeekMethod2 {
//Peek->Not remove only for retrive & fetch//Accessing the element
	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		list.push(2);
		list.push(6);
		list.push(3);
		list.push(9);
		
		System.out.println("After Peek:"+list.peek());
		//not remove or delete
		System.out.println("After Peek:"+list);


	}

}
