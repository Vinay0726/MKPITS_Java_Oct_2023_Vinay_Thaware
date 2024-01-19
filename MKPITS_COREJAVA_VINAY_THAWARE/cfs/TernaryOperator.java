package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernaryOperator {
//It is alternative of if else
//exp1?exp2:exp3
//if exp1 is true then print exp2 if false then exp3
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first number :-");
		int num1=Integer.parseInt(br.readLine());
		System.out.println("Enter Second number :-");
		int num2=Integer.parseInt(br.readLine());
		
		System.out.println((num1>num2)?"First Number is greater":"Second Number is greater");
		String value=(num1>num2)?"First Number is greater":"Second Number is greater";
		System.out.println(value);
		
		
	}

}
