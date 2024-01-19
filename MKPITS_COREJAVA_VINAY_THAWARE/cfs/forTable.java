package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class forTable {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number for table:-");
		int n=Integer.parseInt(br.readLine());
		int i,table;
		for(i=1;i<=10;i++) {
			table=n*i;
			System.out.println(table);
		}

	}

}
