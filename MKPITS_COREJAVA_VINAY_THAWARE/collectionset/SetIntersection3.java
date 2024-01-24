package com.mkpits.collectionset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetIntersection3 {
//Operations on the Set Interface1)Union2)Intersection3)Difference..
//Intersection(retainAll)->This operation returns all the common elements from the given two sets
//Only Print Common Element..Duplicate value only one..
	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {7,2,3,4,1,2,9}));
		
		Set<Integer> set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {5,2,0,4,5,2,0}));
		
		 Set<Integer> intersection = new HashSet<Integer>(set1); 
		 intersection.addAll(set2);
		 System.out.println("Intersaction of Two set:-");
		 intersection.retainAll(set2);
		 System.out.println(intersection);
	}

}
