package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseStatement {
    static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter First Number:");
		int num1=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Second Number:");
		int num2=Integer.parseInt(br.readLine());;
		
		if(num1>num2) {
			System.out.println("First number is greater");
		}
		else if(num2>num1) {
			System.out.println("Second number is greater");
			
		}
		

	}

}
