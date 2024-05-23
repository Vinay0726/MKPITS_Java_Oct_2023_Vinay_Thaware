package com.mkpits.demo;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList=new ArrayList<Integer>(3);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.ensureCapacity(3);
		arrList.add(4);
		arrList.add(5);
		
		
		for (Integer arr : arrList) {
			System.out.println(arr);
		}

	}

}
