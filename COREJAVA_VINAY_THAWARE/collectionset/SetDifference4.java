package com.mkpits.collectionset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDifference4 {
	//Operations on the Set Interface1)Union2)Intersection3)Difference..
	//Difference(removeAll)->This operation removes all the values present in one set from the other set.
	//Remove Common Element..
	//Remove Duplicate Value Print Existing Element..
	//second list compare remove...
	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {7,2,3,4,1,2,9}));
		
		Set<Integer> set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {5,2,0,4,5,2,0}));
		
		 Set<Integer> difference = new HashSet<Integer>(set1); 
		 difference.addAll(set2);
		 
		 difference.removeAll(set2);
		 System.out.println("Difference Two Set:-");
		 System.out.println(difference);
		 
	}

}
