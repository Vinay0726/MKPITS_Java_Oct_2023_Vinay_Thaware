package com.mkpits.allcollectionprograms;

import java.util.Stack;

public class StackIndex37 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(4);
	    stack.add(1);
	    stack.add(2);
	    stack.add(1);
	    stack.add(3);
	    stack.add(2);
	    System.out.println(stack.indexOf(1));
        System.out.println(stack.indexOf(stack, 1));
        System.out.println(stack.lastIndexOf(3));
        System.out.println(stack.lastIndexOf(stack, 2));
	}

}
