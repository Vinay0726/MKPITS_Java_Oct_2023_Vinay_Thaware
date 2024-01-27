package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class HashMapContainsKeyValue3 {
//contains->check Key & and Value are there or not ...return Boolean
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		//Put->Adding key&value..
	    map.put(101, "vinay");
		map.put(102, "raj");
		map.put(103, "sanket");
		map.put(104, "raj");
		
		//check keys are there
		System.out.println("Key are there?"+map.containsKey(105));
		//check value are there
		System.out.println("Value are there?"+map.containsValue("vinay"));

	}

}
