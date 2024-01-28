package com.mkpits.allcollectionprograms;


import java.util.HashMap;
import java.util.Map;

public class HashMapRemove65 {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		//Put->Adding key&value..
	    map.put(101, "vinay");
		map.put(102, "raj");
		map.put(103, "sanket");
		map.put(104, "raj");
		
		System.out.println("Before Map:"+map);
		
		map.remove(104);
		System.out.println("After Remove with key :"+map);

		map.remove(103,"sanket");
		System.out.println("After Remove with key &value "+map);

	}

}
