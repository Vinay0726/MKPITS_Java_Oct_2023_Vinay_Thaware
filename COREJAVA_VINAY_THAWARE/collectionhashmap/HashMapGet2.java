package com.mkpits.collectionhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapGet2 {
//get->It get value using key..
	public static void main(String[] args) {
		//Mapping Integer Value to String.
		HashMap<String, Integer> list=new HashMap<String, Integer>();
		list.put("vinay", 70);
		list.put("raj", 75);
		list.put("pranav", 73);
		list.put("sanket", 65);
		
		for (Map.Entry<String, Integer> entry : list.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("Name:"+key+" Score:"+val);	
		}   
		    System.out.println("------------");
		    System.out.println("Raj Score is->"+list.get("raj"));
		    	    
	        System.out.print("Maximum Score is:-");
	        list.values().stream().reduce(Integer::max).ifPresent(System.out::println);

	}

}
