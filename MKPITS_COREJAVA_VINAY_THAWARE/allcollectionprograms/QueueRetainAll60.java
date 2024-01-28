package com.mkpits.allcollectionprograms;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueRetainAll60 {

	public static void main(String[] args) {

		Queue<String> que=new PriorityQueue<String>(); 
		que.add("Vinay");
		que.add("Raj");
		que.add("Sanket");
		que.add("Pranav");
		
		Queue<String> que1=new PriorityQueue<String>(); 
		que1.add("Harsh");
		que1.add("Regved");
		que1.add("Vinay");
		
		
		que.addAll(que1);
		
		que.retainAll(que1);
		System.out.println(que);
	}

}
