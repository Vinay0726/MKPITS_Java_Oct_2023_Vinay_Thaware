package com.mkpits.allcollectionprograms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator20 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		Iterator itr=list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
