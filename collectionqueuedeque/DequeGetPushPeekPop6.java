package com.mkpits.collectionqueuedeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeGetPushPeekPop6 {

	public static void main(String[] args) {
		Deque<String> city=new ArrayDeque<String>();
		 city.add("Nagpur");
		 city.add("Mumbai");
		 city.add("Pune");
		
		
		 System.out.println("Peek:"+city.peek());
		 System.out.println("Peek First:"+city.peekFirst());
		 System.out.println("Peek Last:"+city.peekLast());
		 System.out.println("--------------");
		 System.out.println("Peek First:"+city.getFirst());
		 System.out.println("Peek Last:"+city.getLast());
		 System.out.println("---------------");
		 city.push("Jaipur");
		 System.out.println("Push:"+city);
		 System.out.println("----------------");
		 city.pop();
		 System.out.println("Pop:"+city);
		 
		 System.out.println("----------------");
		 System.out.println("Poll:"+city.poll());

	}

}
