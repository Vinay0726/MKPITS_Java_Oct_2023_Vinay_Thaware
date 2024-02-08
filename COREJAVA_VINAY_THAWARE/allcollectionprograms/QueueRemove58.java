package com.mkpits.allcollectionprograms;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRemove58 {

	public static void main(String[] args) {
	
		Queue<String> que=new PriorityQueue<String>();
		que.add("I");
		que.add("Love");
		que.add("Nagpur");
		
		System.out.println("Initial que:"+que);
		que.remove();
		System.out.println("After Remove First Element:"+que);
		
		que.remove("Love");
		System.out.println("Remoing with Object Love:"+que);

	}

}
