package com.mkpits.collectionhashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapPutAll11 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		//Put->Adding key&value..
	    map.put(102, "vinay");
		map.put(101, "raj");
		map.put(103, "sanket");
		map.put(104, "raj");
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		//Put->Adding key&value..
	    map1.put(106, "chetan");
		map1.put(105, "vaibhav");
		map1.put(100, "ashiq");
		map1.put(106, "pranav");
		
		map.putAll(map1);
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			 String val = entry.getValue();
			 System.out.println("Id:"+key+" Name:"+val);
			
		}
	}

}
