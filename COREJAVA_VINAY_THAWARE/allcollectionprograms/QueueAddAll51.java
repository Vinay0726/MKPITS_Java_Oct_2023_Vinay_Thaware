package com.mkpits.allcollectionprograms;

import java.util.PriorityQueue;
import java.util.Queue;


public class QueueAddAll51 {
//Duplicate value allow..
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
		que1.add("Ashiq");
		
		que.addAll(que1);
	    
		que.forEach(n->System.out.println(n));
	}

}
