package com.mkpits.collectionlinkedlist;

import java.util.LinkedList;

public class ExampleClearCloneMethod3 {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList();
		name.add("vinay");
		name.add("raj");
		name.add("Sanket");
		
		name.clone();
		System.out.println("After Cloning:"+name);
		
		
		name.clear();
		System.out.println("After Clear:"+name);
		
	}

}
