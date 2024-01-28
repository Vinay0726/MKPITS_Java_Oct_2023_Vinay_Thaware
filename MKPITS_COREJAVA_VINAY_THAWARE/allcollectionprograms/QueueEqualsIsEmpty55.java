package com.mkpits.allcollectionprograms;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEqualsIsEmpty55 {

	public static void main(String[] args) {
		Queue<String> que=new PriorityQueue<String>(); 
		que.add("Vinay");
		que.add("Raj");
		que.add("Sanket");
		que.add("Pranav");
		
		
		System.out.println("Equal Object:"+que.equals(que));
		
		que.removeAll(que);
		
		System.out.println("Queue is empty?"+que.isEmpty());

	}

}
