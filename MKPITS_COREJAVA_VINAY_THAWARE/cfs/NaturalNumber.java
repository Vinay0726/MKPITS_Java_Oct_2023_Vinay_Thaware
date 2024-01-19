package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NaturalNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Natural Number:-");
		int n=Integer.parseInt(br.readLine());
		int i,sum=0;
		for(i=0;i<=n;i++) {
			sum=sum+i;
			System.out.println(sum);
		}
}}
