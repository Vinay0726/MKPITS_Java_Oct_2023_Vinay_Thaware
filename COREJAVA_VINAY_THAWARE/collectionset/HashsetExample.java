package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		
		Set<String> color=new HashSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		
		Set<String> color1=new HashSet<String>();
		color1.add("White");
		color1.add("Blue");
		color1.add("Black");
		color1.add("Yellow");
		
		color.addAll(color1);
		System.out.println(color);
		
		s

	}

}
