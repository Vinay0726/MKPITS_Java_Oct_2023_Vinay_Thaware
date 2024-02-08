package com.mkpits.collectionqueuedeque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeAdd1 {
//Deque-It is related to the double-ended queue that supports the addition or removal of elements from either end of the data structure.
// It can either be used as a queue(first-in-first-out/FIFO) or as a stack(last-in-first-out/LIFO). 
// Deque is the acronym for double-ended queue.
   public static void main(String[] args) {
		
	   Deque<Integer> deq=new LinkedList<Integer>();
	   deq.add(83);
	   deq.add(53);
	   deq.add(37);
	   deq.add(17);
	  
			System.out.println("Initial Deque:"+deq);
		
	   deq.addFirst(25);
	   deq.addLast(62);
	  
		System.out.println("After Adding First & Last:"+deq);

	}

}
