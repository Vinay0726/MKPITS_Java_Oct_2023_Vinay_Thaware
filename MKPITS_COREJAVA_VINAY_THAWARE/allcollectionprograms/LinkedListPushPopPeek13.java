package com.mkpits.allcollectionprograms;

import java.util.LinkedList;

public class LinkedListPushPopPeek13 {

	public static void main(String[] args) {
		 LinkedList<Integer> list=new LinkedList<Integer>();
			list.push(3);
			list.push(2);
			list.push(1);
			list.push(4);
			System.out.println(list);
			
			list.pop();
			System.out.println(list);
			
			System.out.println(list.peek());
			System.out.println(list.peekFirst());
			System.out.println(list.peekLast());
			
			list.poll();
			System.out.println(list);
	}

}
