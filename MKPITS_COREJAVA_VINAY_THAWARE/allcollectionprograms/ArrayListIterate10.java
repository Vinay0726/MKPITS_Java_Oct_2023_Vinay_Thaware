package com.mkpits.allcollectionprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterate10 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
