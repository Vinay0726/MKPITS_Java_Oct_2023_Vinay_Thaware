package com.mkpits.allcollectionprograms;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueContainsAll54 {

	public static void main(String[] args) {
		
		Queue<Integer> que = new PriorityQueue<Integer>();
		que.add(20);
		que.add(10);
		que.add(18);
		
		//contains with object
		System.out.println("In queue Contains are there?:"+que.contains(20));
		
		Queue<Integer> que1 = new ConcurrentLinkedQueue<Integer>();
		
		que1.add(15);
		que1.add(18);
		
		
       System.out.println("In queue Contains are there?:"+que.containsAll(que1));
	}

}
