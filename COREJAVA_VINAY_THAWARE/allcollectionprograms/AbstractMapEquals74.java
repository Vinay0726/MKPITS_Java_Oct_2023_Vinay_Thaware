package com.mkpits.allcollectionprograms;

import java.util.AbstractMap;
import java.util.IdentityHashMap;

public class AbstractMapEquals74 {
//AbstactMap->The AbstractMap.equals() method in Java is used to check for equality between two maps.
//It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not.
	public static void main(String[] args) {
		
		AbstractMap<Integer, String> absMap=new IdentityHashMap<Integer, String>();
		absMap.put(105,"Vinay" );
		absMap.put(103,"Raj");
		absMap.put(102,"Sanket" );
		absMap.put(101,"Pranav");
		
        AbstractMap<Integer, String> absMap1=new IdentityHashMap<Integer, String>();
		absMap1.put(105,"Vinay" );
		absMap1.put(103,"Raj");
		absMap1.put(102,"Sanket" );
		absMap1.put(101,"Pranav");
		
		System.out.println("Mapping 1 &Mapping 2 are Equal??"+absMap.equals(absMap1));
		
}
}
