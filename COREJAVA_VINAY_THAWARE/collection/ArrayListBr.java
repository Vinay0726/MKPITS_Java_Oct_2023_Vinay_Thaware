package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListBr {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//			String []size=new String[5];
//			int s=(int)(size.length);
			for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Enter Name:-");
				String n = br.readLine();
				name.add(n);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			}
			for (String nm : name) {
				System.out.println("Name:"+nm);
			}
		}
	}


