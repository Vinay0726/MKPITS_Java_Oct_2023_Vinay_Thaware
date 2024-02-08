package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortArray {
    
	public static void main(String[] args) throws NumberFormatException, IOException  {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 5 Numbers");
		int number[] = new int[5];
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("Enter "+ (i+1) +" Number");
			number[i] = Integer.parseInt(br.readLine());
		}
		//Arrays.sort( a)//It is use for ascending
		Arrays.sort(number);
		
		for (int num : number) {
			System.out.println(num);
		}
	}
}
