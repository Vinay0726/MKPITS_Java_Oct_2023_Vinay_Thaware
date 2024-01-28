package com.mkpits.allcollectionprograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapPut61 {
//HashMap is part not a part of collection but it will be collection it not extend collection..
//HashMap having (Key ,Value) pair..(Entry).
//It allows Duplicate value but not allows duplicate key...
//Capacity is 16..
//All key unique..Null value get...It not allow insertion order..HashTable data structure...
	public static void main(String[] args) {
	
		HashMap<Integer, String> list=new HashMap<Integer, String>();
		//Put->Adding key&value..
	    list.put(102, "vinay");
		list.put(101, "raj");
		list.put(103, "sanket");
		list.put(104, "raj");
		
		//System.out.println("Before List:"+list);
		//Traverse
		for (Map.Entry<Integer, String> entry : list.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println("Key :"+key+" Value:"+val);
			
		}
		System.out.println("---------------------");
		list.put(104, "pranav");
		System.out.println("After Adding new same key");
		for (Map.Entry<Integer, String> entry : list.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println("Key :"+key+" Value:"+val);
			
		}
		
		
		System.out.println("------------");
		//Print Key only using key set
//		var keySet=list.keySet();
//		for(var key : keySet) {
//			System.out.println(key);	
//		}
//		System.out.println("-----------");
//		//Print Value only using values
//		var value=list.values();
//		for(var v : value) {
//			System.out.println(v);	
//		}
//		System.out.println("---------");
		
		System.out.println("Key->");
		list.keySet().forEach(System.out::println);
		System.out.println("--------------");
		System.out.println("value->");
		list.values().forEach(System.out::println);
		
	}

}
