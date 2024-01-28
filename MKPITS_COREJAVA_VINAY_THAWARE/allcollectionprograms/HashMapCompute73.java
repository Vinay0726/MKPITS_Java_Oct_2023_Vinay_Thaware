package com.mkpits.allcollectionprograms;


import java.util.HashMap;

public class HashMapCompute73{
//Compute ->The compute(Key, BiFunction) method of HashMap class allows you to update a value in HashMap
//It used to append the value...
	public static void main(String[] args) {
		
		HashMap<String, String> map=new HashMap<String, String>();
	    map.put("Maharashtra", "Nagpur");
	    map.compute("Maharashtra",( (key, val) -> val.concat(" 440013")));
		System.out.println(map);
	}

}
