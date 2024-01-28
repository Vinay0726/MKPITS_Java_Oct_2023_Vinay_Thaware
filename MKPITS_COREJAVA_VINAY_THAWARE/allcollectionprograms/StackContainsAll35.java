package com.mkpits.allcollectionprograms;

import java.util.Stack;

public class StackContainsAll35 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(4);
	    stack.add(1);
	    stack.add(2);
	    stack.add(3);
	    
	    Stack<Integer> stack1=new Stack<Integer>();
		stack1.add(7);
	    stack1.add(9);
	    stack1.add(3);
	    stack1.add(5);
	    
	    stack.addAll(stack1);
	    System.out.println(stack.containsAll(stack1));

	}

}
