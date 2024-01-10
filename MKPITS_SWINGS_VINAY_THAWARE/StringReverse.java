package com.mkpits.arrays;

public class StringReverse {

	public static void main(String[] args) {
		String name="Vinay Thaware";
		
		char ch[]=new char[name.length()];
		
		for (int i = 0; i < ch.length; i++) {
			//for get charater
			ch[i]=name.charAt(i);
			
		}for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("Reverse order is:-");
         for(int i=ch.length-1;1>=0;i--) {
        	 System.out.println(ch[i]);
         }
	}

}
