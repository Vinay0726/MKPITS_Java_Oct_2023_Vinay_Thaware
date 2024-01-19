package com.mkpits.enums;

public class EnumClass {
	//An enum  is a special "class" that represents a group of constants (unchangeable variables, like final variables).
	//To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
	//Note that they should be in uppercase letters
	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH;
		}
	public static void main(String[] args) {
	 //You can access enum constants with the dot syntax:
		Level l=Level.MEDIUM;	
	    System.out.println(l);
	    
	    System.out.println("--------------");
	    for (Level string : Level.values()) {
			System.out.println(string);
		}
	}
	
}
