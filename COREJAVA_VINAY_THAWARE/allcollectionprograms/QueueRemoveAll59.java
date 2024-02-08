package com.mkpits.allcollectionprogramss;

import java.util.PriorityQueue;
import java.util.Queue;


public class QueueRemoveAll59 {

	public static void main(String[] args) {
		Queue<String> que=new PriorityQueue<String>(); 
		que.add("Vinay");
		que.add("Raj");
		que.add("Sanket");
		
		Queue<String> que1=new PriorityQueue<String>(); 
		que1.add("Harsh");
		que1.add("Regved");
		que1.add("Vinay");
		
		
		que.addAll(que1);
	    System.out.println("After Add All:"+que);
		//Duplicate value remove
		que.removeAll(que1);
		System.out.println("After Remove all:"+que);
	}

}
