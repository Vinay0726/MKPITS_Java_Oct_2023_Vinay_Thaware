package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IterativeRepetativeCfs {
   static BufferedReader br;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:-");
		int num=Integer.parseInt(br.readLine());
		
		//while loop is a Entry level-- 1)Initialization 2)condition 3)Increment/Decrement
		//condition check then block of code
		while(num<10) {
        num++;
        System.out.println(num);
		}
		
		
}
}
