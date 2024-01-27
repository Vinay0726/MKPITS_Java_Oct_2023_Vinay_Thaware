package com.mkpits.collectionqueuedeque;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueClearSize6{

	public static void main(String[] args) {
		Queue<Integer> que = new PriorityQueue<Integer>();
		que.add(20);
		que.add(10);
		que.add(18);
		
		
		System.out.println("Queue Size is:"+que.size());
		
		que.clear();
		System.out.println("After Clear:"+que);
	}

}
