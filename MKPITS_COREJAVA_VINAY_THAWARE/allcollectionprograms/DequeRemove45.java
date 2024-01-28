package com.mkpits.allcollectionprograms;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeRemove45 {

	public static void main(String[] args) {
		 Deque<String> city=new ArrayDeque<String>();
		 city.add("Nagpur");
		 city.add("Mumbai");
		 city.add("Pune");
		 city.add("Delhi");
		 city.add("Jiapur");
		 
		 System.out.println(city);
         
		 city.remove();
		 System.out.println("After Remove:"+city);
		 
		 city.removeFirst();
		 System.out.println("After Remove First:"+city);
		 
		 city.removeLast();
		 System.out.println("After Remove Last:"+city);
		 
		 
	}

}
