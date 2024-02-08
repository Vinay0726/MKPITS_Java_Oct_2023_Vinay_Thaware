package com.mkpits.collectionqueuedeque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeAddAll2 {

	public static void main(String[] args) {
		Deque<Integer> deq=new LinkedList<Integer>();
		   deq.add(83);
		   deq.add(53);
		   deq.add(37);
		   deq.add(17);
		  
		   Deque<Integer> deq1=new LinkedList<Integer>();
		   deq1.add(52);
		   deq1.add(22);
		   deq1.add(10);
		   deq1.add(25);
		   
		   deq.addAll(deq1);
		   System.out.println(deq);
		   
		   
			
			
		  

	}

}
