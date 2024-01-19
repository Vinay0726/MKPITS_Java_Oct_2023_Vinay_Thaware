package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoop {
     static BufferedReader br;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number for factorial no:-");
		int num=Integer.parseInt(br.readLine());
		int i,fact=1;
		for(i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println(fact);
		}
		
	
		
	}

}
