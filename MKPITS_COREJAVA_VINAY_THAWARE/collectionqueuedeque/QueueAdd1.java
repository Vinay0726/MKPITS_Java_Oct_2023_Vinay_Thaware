package com.mkpits.collectionqueuedeque;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAdd1 {

	//Queue->It is used to hold the elements about to be processed in FIFO(First In First Out) order
	//It is an (ordered list) of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list
	//it follows the FIFO or the First-In-First-Out principle.
	//the PriorityQueue and LinkedList are not thread-safe. 
	//PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed.
	public static void main(String[] args) {
		
		Queue<String> que=new PriorityQueue<String>();
		que.add("I");
		que.add("Love");
		que.add("Nagpur");
		
		System.out.println(que);
		
		System.out.println("---------");
		
		que.forEach(System.out::println);
	}

}
