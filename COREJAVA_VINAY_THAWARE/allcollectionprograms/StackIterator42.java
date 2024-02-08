package com.mkpits.allcollectionprograms;

import java.util.Iterator;
import java.util.Stack;

public class StackIterator42 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(4);
	    stack.add(1);
	    stack.add(2);
	    stack.add(1);
	    Iterator itr=stack.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}

}
