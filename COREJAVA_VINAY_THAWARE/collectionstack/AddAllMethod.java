package com.mkpits.collectionstack;

import java.util.Stack;

public class AddAllMethod {

	public static void main(String[] args) {
		
		Stack<Integer> list=new Stack<>();
	    
		
		list.add(3);
		list.add(2);
		list.add(8);
		list.add(9);
		
		
		System.out.println("After Add :"+list);
		
		list.add(1, 1);
		System.out.println("After add with index:"+list);
        
		Stack<Integer> list1=new Stack<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(6);
		
		list.addAll(list1);
		System.out.println("After Adding all with 2nd List:"+list);
	}

}
