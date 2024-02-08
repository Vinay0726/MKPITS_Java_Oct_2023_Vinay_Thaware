package com.mkpits.allcollectionprograms;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeIteratorDescending48 {

	public static void main(String[] args) {
		
		Deque<Integer> deq=new LinkedList<Integer>();
		   deq.add(83);
		   deq.add(53);
		   deq.add(10);
		   deq.add(25);
		   
		   Iterator<Integer> itr=deq.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   System.out.println("------------");
		   System.out.println("After Decending !!");
		   
		   Iterator<Integer> itr1=deq.descendingIterator();
		   while(itr1.hasNext()) {
			   System.out.println(itr1.next());
		   }

	}

}
