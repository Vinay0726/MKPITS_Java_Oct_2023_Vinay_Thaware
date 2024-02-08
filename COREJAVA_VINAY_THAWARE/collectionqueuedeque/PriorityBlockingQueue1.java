package com.mkpits.collectionqueuedeque;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue1 {
	//the PriorityQueue and LinkedList are not thread-safe. 
	//PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed.
	public static void main(String[] args) {
		
		Queue<Integer> que = new PriorityBlockingQueue<Integer>();
		que.add(20);
		que.add(10);
		que.add(18);
		
		System.out.println(que);
		//peet->This method is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println(que.peek());
		
		//Removing the head element..return null if empty
		System.out.println(que.poll());
		
		//Priority vice small get first
		System.out.println(que.peek());
	}

}
