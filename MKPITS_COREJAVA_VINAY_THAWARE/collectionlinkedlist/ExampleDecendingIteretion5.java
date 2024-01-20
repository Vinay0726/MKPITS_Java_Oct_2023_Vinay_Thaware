package com.mkpits.collectionlinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleDecendingIteretion5 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(3);
		list.add(2);
		list.add(8);
		list.add(1);
		list.add(6);
		
		
		
		Iterator<Integer> itr=list.descendingIterator();
		System.out.println("Decending List-->");
		while(itr.hasNext()) {
			int des=itr.next();
			System.out.println(des);
			
		}
		
	    
	}

}
