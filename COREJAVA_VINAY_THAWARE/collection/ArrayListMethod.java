package com.mkpits.collection;

import java.util.ArrayList;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<String>colorList=new ArrayList<String>();
		colorList.add("Blue");
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Yellow");
		
		for (String color : colorList) {
			System.out.println(color);
			
		}
		
		ArrayList<String> colorList1=new ArrayList<String>();
		colorList1.add("Red");
		colorList1.add("Voilet");
		colorList1.add("Green");
		colorList1.add("White");
		for (String color : colorList1) {
			System.out.println(color);
		}
		
		System.out.println("Adding All...");
		colorList.addAll(colorList1);
		//adding one to another
		System.out.println("Size after Adding all:-"+colorList.size());
		for (String color : colorList) {
			System.out.println(color);
		}
//		
//		System.out.println("Remove All...");
//		colorList.removeAll(colorList1);
//		//After Removing all remove same name also
//		System.out.println("Size after Remove all:-"+colorList.size());
//		for (String color : colorList) {
//			System.out.println(color);
//		} 
//		System.out.println("Retain All...");
//		colorList.retainAll(colorList1);
//		//Same name add  with second arrayList
//		System.out.println("Size after Retain all:-"+colorList.size());
//		for (String color : colorList) {
//			System.out.println(color);
//		}
		
		
//       //Clear-->Clear All Element In List
//		colorList.clear();
//		System.out.println(colorList);
//	}
        
}}
