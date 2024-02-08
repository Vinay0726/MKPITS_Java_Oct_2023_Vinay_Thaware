package com.mkpits.allcollectionprograms;

import java.util.Stack;

public class StackPeek41 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(4);
	    stack.add(1);
	    stack.add(2);
	    stack.add(1);
	    System.out.println(stack);
	    stack.push(30);
	    System.out.println(stack);
	    stack.pop();
	    System.out.println(stack);
	    System.out.println(stack.peek());
	    
	}

}
