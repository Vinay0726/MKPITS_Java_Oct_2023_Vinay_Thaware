package com.mkpits.allcollectionprograms;


import java.util.HashMap;
import java.util.Map;

public class HashMapTransversal66 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		//Put->Adding key&value..
	    map.put(101, "vinay");
		map.put(102, "raj");
		map.put(103, "sanket");
		map.put(104, "raj");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			 String val = entry.getValue();
			 System.out.println("Roll no:"+key+" Name:"+val);
			
		}
		
	}

}
