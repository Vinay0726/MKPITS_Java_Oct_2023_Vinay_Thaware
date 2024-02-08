package com.mkpits.allcollectionprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAdd11 {

	public static void main(String[] args) {
       LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		list.push(10);
		System.out.println(list);

	}

}
