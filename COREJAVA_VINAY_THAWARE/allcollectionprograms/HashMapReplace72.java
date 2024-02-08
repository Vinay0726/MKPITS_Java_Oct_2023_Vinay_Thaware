package com.mkpits.allcollectionprograms;


import java.util.AbstractMap;
import java.util.HashMap;


public class HashMapReplace72 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		//Put->Adding key&value..
	    map.put(102, "vinay");
		map.put(101, "raj");
		map.put(103, "sanket");
		map.put(104, "raj");
		
		//Replace value using Key
		map.replace(104, "pranav");
		System.out.println(map);
		//(old key,old value,new value)
		map.replace(103, "sanket", "vaibhav");
		System.out.println(map);
		

	}

}
