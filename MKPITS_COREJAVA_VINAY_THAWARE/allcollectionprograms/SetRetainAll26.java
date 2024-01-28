package com.mkpits.allcollectionprograms;

import java.util.HashSet;
import java.util.Set;

public class SetRetainAll26 {

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<Integer>();
		set.add(4);
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    Set<Integer>set1=new HashSet<Integer>();
		set1.add(5);
	    set1.add(3);
	    set1.add(8);
	    set1.add(9);
	   
	    set.addAll(set1);
	    set.retainAll(set1);
	    System.out.println(set);

	}

}
