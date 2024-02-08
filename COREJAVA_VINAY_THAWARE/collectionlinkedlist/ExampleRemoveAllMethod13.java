package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;

public class ExampleRemoveAllMethod13 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList();
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(9);
		
		System.out.println("Intial List:"+list);
		System.out.println("Remove Element by 2 Index:"+list.remove(2));
		System.out.println("Remove First Element:"+list.removeFirst());
		System.out.println("Remove Last Element:"+list.removeLast());
		
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(2);
		list1.add(8);
		list.add(9);
		System.out.println("------------");
	    list.addAll(list1);
		System.out.println("After AddingList:"+list);
		
		
		list.removeAll(list1);
		System.out.println("After RemoveAll:"+list);
			

	}

}
