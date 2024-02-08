package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
	//Generic version--No Bounded in any Datatype//<> use...
	//Use Wrapper Class
		List<String> list=new ArrayList<String>();
		list.add("Vinay");
		list.add("Raj");
		list.add("Sanket");
		list.add("Harsh");
		list.add("Ashiq");
		
		System.out.println("Using For Loop -->");
		for (int i = 0; i < list.size(); i++) {	


		}
		
		System.out.println("Using For-Each Loop -->");
		for (String name : list) {
			System.out.println(name);	
		}
		
		System.out.println("Using Iterator -->");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			System.out.println(name);
		}
		//Type caste safety--it is easily type caste
        String listName=list.get(0);
        System.out.println(listName);
	}

}
