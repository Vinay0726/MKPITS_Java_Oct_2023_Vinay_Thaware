package com.mkpits.lambdaexpression;

public class InterfaceString {
	
	public interface format{
		String text(String txt);
	}
	 String data(String txt,format obj) {
		return obj.text(txt);
	}
	public static void main(String[] args) {
		
		format f=(String s)->s+"!";
		System.out.println(f.text("Hello"));
		format f1=(String s)->s+"?";
		System.out.println(f1.text("Hello"));

	}

}
