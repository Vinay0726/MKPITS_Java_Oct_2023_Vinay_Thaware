package com.mkpits.collectionstack;

import java.util.Stack;

public class StackRemovingElementOneByOne {

	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		list.push(2);
		list.push(6);
		list.push(3);
		list.push(9);
		//Removing Element one by one LIFO
		while(!list.isEmpty()){
			System.out.println(list.pop());
			
		}

	}

}
