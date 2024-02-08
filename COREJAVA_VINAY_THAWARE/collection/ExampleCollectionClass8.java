package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExampleCollectionClass8 {

	public static void main(String[] args) {
		List<Integer> number=new ArrayList<Integer>();
		number.add(3);
		number.add(12);
		number.add(1);
		number.add(7);
		number.add(73);
		
		//Ascending 
		Collections.sort(number);
		for (Integer ascending : number) {
			System.out.println(ascending);
		}
		System.out.println("-------------");
		//Reverse
		Collections.sort(number,Collections.reverseOrder());
		for (Integer reverse: number) {
			System.out.println(reverse);
			
		}
	}

}
