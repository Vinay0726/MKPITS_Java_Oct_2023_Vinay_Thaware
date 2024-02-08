package com.mkpits.collectionset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUnion2 {
	//Operations on the Set Interface1)Union2)Intersection3)Difference..
//Union(addAll)->This operation adds all the elements in one set with the other.
//Remove Duplicate element print all element & duplicate element 1 time..
	public static void main(String[] args) {
		
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {7,2,3,4,1,2,9}));
		
		Set<Integer> set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {5,2,0,4,5,2,0}));
		
		 Set<Integer> union = new HashSet<Integer>(set1); 
		 union.addAll(set2);
		 System.out.println("Union of two set :-");
		 System.out.println(union);
		 System.out.println("-------------");
		 set1.addAll(set2);
		 System.out.println("Union of two set :-");
		 System.out.println(set1);
		
	}

}
