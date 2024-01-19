package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleDimension {
  //array is collection of similar data item reference using comman name by using index o//0-9
	//single array An array which elements are referred using single index .
	//1)Deceleration 2)construction 3)initialization
	public static void main(String[] args) throws NumberFormatException, IOException {
		SingleDimension s=new SingleDimension();
		s.getNumber();
		
	}
	public void getNumber() throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 number:");
		int number[]=new int[5];
		int i,j,temp;
		for( i = 0;i<number.length;i++) {
		number[i]=Integer.parseInt(reader.readLine());
		}
		// Ascending order bubble sorting
		for( i=0;i<number.length;i++) {
			for(j=i+1;j<number.length;j++) {
			if(number[i]>number[j]) {
				temp=number[i];
				number[i]=number[j];
				number[j]=temp;
			}
		}
	} 
		for(i=0;i<number.length;i++) {
			System.out.println("Accending Number is:-"+number[i]);
		 } 	
 }
}
	

