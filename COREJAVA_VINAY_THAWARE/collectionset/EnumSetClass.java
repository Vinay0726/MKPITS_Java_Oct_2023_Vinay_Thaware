package com.mkpits.collectionset;

import java.util.EnumSet;
import java.util.Set;

enum color{RED,BLUE,ORANGE,GREEN};
public class EnumSetClass {
//Enumerations or popularly known as enum serve the purpose of representing a group of named constants in a programming language.
	public static void main(String[] args) {
		
      Set<color> set1;
      set1=EnumSet.of(color.ORANGE,color.GREEN,color.RED,color.BLUE);
      System.out.println("Set1:"+set1);
	}

}
