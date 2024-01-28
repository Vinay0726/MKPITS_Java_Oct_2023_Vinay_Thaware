package com.mkpits.allcollectionprograms;

import java.util.Stack;

public class StackSet38 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(4);
	    stack.add(1);
	    stack.add(2);
	    stack.add(1);
	    
	    System.out.println(stack);
	    
	    stack.set(1, 10);
	    System.out.println(stack);

	}

}
