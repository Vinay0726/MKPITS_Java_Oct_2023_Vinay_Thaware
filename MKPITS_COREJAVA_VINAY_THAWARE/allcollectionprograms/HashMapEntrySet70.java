package com.mkpits.allcollectionprograms;


import java.util.HashMap;

public class HashMapEntrySet70 {
//EntrySet->It is used to create a set out of the same elements contained in the hash map.
//It basically returns a set view of the hash map or we can create a new set and store the map elements into them.
	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Vinay", 102);
		map.put("Raj", 101);
		map.put("sanket", 202);
		map.put("pranav", 109);
		map.put("Ashi1", 105);
		
		System.out.println("Initial Mapping:"+map);
		//It Returns a set view..
		System.out.println("After Entry Set:"+map.entrySet());
	}

}
