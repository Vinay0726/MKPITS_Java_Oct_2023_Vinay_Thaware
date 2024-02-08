package com.mkpits.allcollectionprograms;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapClear68 {

	public static void main(String[] args) {
		//Mapping Integer value to String
		//LinkedHashMap->Order Mapping..
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		map.put("Vinay", 102);
		map.put("Raj", 101);
		map.put("sanket", 202);
		map.put("pranav", 109);
		map.put("Ashi1", 105);
		
		System.out.println("Initial Mapping:"+map);
		
		map.clear();
		
		System.out.println("After Clear Mapping:"+map);
	}

}
