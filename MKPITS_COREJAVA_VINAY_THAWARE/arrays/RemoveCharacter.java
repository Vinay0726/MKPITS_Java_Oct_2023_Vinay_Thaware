package com.mkpits.arrays;

import java.util.Iterator;



public class RemoveCharacter {

	public static void main(String[] args) {
		RemoveCharacter r=new RemoveCharacter(); 
		r.removeCharcter();

	}

	public static void removeCharcter() {
		
		String name="Vinay Thaware";
		char[] ch=new char[name.length()];
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				if(name.charAt(i)==name.charAt(j))
				{
				
			      System.out.println(name.charAt(j));
				}
			}
		}
		
	}

}
