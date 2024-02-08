package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatch {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		int num1=10,num2=0;
		//try:-we have to code in this with exception ..if try having exception then catch or finally..
		//catch:-if exception is occur then catch..
		try {
			System.out.println(arr[5]);
		}
		//catch(Exception Object)
		catch(ArrayIndexOutOfBoundsException e) {
			//obj.printStackTrace
			e.printStackTrace();
		}
		try {
			System.out.println(num1/num2);
		}
		//catch(SuperClassName object)
		catch(Exception e) {
			e.printStackTrace();
		}
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name:-");
		try {
           String name=br.readLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
