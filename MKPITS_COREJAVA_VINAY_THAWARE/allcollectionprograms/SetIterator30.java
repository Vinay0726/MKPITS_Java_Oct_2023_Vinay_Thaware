package com.mkpits.allcollectionprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator30 {

	public static void main(String[] args) {
		
		Set<Integer>set=new HashSet<Integer>();
		set.add(4);
	    set.add(1);
	    set.add(2);
	    set.add(3);
	   
	    Iterator itr=set.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }

	}

}
