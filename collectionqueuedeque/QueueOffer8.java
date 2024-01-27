package com.mkpits.collectionqueuedeque;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueOffer8 {

	public static void main(String[] args) {
	
		Queue<Integer> que = new PriorityQueue<Integer>();
		que.add(20);
		que.add(10);
		que.add(18);
		
		//offer->Enter Specific element into queue
		que.offer(30);
		
		que.forEach(System.out::println);

	}

}
