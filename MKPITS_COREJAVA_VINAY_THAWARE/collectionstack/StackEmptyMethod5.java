package com.mkpits.collectionstack;

import java.util.Stack;

public class StackEmptyMethod5 {
//Empty->Check weather Stack is empty or not ..If Empty then true or false..
//It returns in boolean form
	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		list.push(2);
		list.push(6);
		list.push(3);
		list.push(9);
		
		System.out.println("Is this Stack is empty?"+list.empty());
		
		Stack list1=new Stack();
		list.removeAllElements();
		System.out.println("Is this Stack is empty?"+list.empty());
	}

}
