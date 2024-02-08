package com.mkpits.collectionqueuedeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeRetainAll5 {

	public static void main(String[] args) {
		Deque<String> city=new ArrayDeque<String>();
		 city.add("Nagpur");
		 city.add("Mumbai");
		 city.add("Pune");
		 city.add("Jiapur");
		 
		 Deque<String> city1=new ArrayDeque<String>();
		 city1.add("Nagpur");
		 city1.add("Pune");
		 city1.add("Delhi");
		 
		 city.addAll(city1);
		 city.retainAll(city1);
		 System.out.println(city);

	}

}
