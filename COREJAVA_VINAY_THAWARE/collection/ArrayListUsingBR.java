package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListUsingBR {
 
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Much data you want to Enter-");
		try {
		int data=Integer.parseInt(br.readLine());
		for (int i = 0; i < data; i++) {
			System.out.println("Enter Name :");
			String n=br.readLine();
			names.add(n);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			for (String name : names) {
				System.out.println("Name :-"+name);
			}
		}
	}


