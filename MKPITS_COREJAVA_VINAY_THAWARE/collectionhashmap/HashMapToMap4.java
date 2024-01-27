package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class HashMapToMap4 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		//Put->Adding key&value..
	    map.put(101, "vinay");
		map.put(102, "raj");
		map.put(103, "sanket");
		map.put(104, "raj");
		
		//Map To Map
		HashMap<Integer, String> map1=new HashMap<Integer, String>(map);
		
		System.out.println(map);
		System.out.println(map1);
		System.out.println("-------------------------------------------");
		map1.put(107, "pranav");
		System.out.println(map);
		System.out.println(map1);
		

	}

}
