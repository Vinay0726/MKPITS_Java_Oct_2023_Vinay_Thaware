package com.mkpits.demo;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
	LinkedList<String> color=new LinkedList<>();
	color.add("red");
	color.add("blue");
	color.add("green");
	
	color.remove(1);
	System.out.println(color);
	
	color.removeFirst();
	System.out.println(color);
	
	color.clear();
	System.out.println(color);
	

	}

}
