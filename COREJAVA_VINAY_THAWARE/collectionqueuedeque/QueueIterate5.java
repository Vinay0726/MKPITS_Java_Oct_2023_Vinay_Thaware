package com.mkpits.collectionqueuedeque;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueIterate5 {

	public static void main(String[] args) {
		
			Queue<Integer> que=new PriorityQueue<Integer>();
			que.add(5);
			que.add(2);
			que.add(1);
			que.add(8);
			que.add(7);
			
			
			Iterator itr=que.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	}

}
