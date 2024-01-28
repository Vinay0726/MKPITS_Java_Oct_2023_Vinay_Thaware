package com.mkpits.allcollectionprograms;

import java.util.HashSet;
import java.util.Set;

public class SetAddAll23 {

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<Integer>();
		set.add(4);
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    Set<Integer>set1=new HashSet<Integer>();
		set1.add(4);
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    
	    set.addAll(set1);
	    System.out.println(set);

	}

}
