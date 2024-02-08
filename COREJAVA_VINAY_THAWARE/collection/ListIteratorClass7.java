package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass7 {

	public static void main(String[] args) {
		
		List<String> nameList=new ArrayList<String>();
		 nameList.add("Vinay");
		 nameList.add("Raj");
		 nameList.add("Sanket");
		 nameList.add("Ashiq");
		 
		 ListIterator<String> itr=nameList.listIterator();
		 System.out.println("Forward Order-->");
		 while(itr.hasNext()) {
			 String name=itr.next();
			 System.out.println(name);
		 }
		 System.out.println("--------------");
		 System.out.println("Previous Order-->");
		 while(itr.hasPrevious()) {
			 String name=itr.previous();
			 System.out.println(name);
		 }

	}

}
