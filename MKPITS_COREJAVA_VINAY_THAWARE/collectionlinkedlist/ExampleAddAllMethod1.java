package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;
import java.util.List;

public class ExampleAddAllMethod1 {
//LinkList-->It is not contineous Element...(predefined Class)
	       //Internally use Pointer & Addresses--Node  
	       //Dynamically insertion & Deletion
	       //Do not have a specific size ...Automatically Increases
	       //Faster than ArrayList
	       ///TimeComplexity low than ArrayList
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(9);
		
		System.out.println("Intial List:"+list);
		
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(2);
		list1.add(8);
		list.add(9);
		System.out.println("------------");
		list.addAll(list1);
		System.out.println("After AddingList:"+list);
		

	}

}
