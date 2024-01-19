package com.mkpits.arrays;

import java.util.Arrays;

public class FindingSecondLargest {

	public static void main(String[] args) {
		//For Second Highest number using Arrays.sort
		int[] num= {1 ,9 ,8, 10, 3 ,6};
		Arrays.sort(num);
		
		for (int index = 0; index < num.length; index++) {
			System.out.println(num[index]);
		}
		
		System.out.println("Last second highest value: " + num[num.length - 2]);
		}
}
