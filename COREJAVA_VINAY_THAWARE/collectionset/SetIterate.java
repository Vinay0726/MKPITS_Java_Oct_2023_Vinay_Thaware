package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterate {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("A");
		set.add("D");
			
//		System.out.println("-----------");
//		set.forEach(System.out::println);
//		System.out.println("-----------");
//		set.forEach(n->System.out.println(n));
		
		System.out.println("Using Iterator->");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------");
		System.out.println("Using For-Each ->");
		for (String str : set) {
			System.out.println(str);
		}
		
	}

}
