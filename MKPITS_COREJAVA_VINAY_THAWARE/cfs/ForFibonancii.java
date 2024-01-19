package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForFibonancii {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number :-");
		int n=Integer.parseInt(br.readLine());
		
		int fibo,num1 = 0,num2 = 1;
		System.out.println(+num1+"\n"+num2);
		for(int i = 0;i<=n;i++) {
			
			fibo = num1+num2;
			System.out.println(fibo);
			num1=num2;
			num2=fibo;
			
		}
		
		

	}

}
