package com.mkpits.allcollectionprograms;


import java.util.HashMap;
import java.util.Map;

public class HashMapClone69 {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Vinay", 102);
		map.put("Raj", 101);
		map.put("sanket", 202);
		map.put("pranav", 109);
		map.put("Ashi1", 105);
		
		System.out.println("Inital Mapping:"+map);
		
		System.out.println("After Clone :"+map.clone());

	}

}
