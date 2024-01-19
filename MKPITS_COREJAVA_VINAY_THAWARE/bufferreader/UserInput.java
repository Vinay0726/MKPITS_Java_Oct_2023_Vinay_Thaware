package com.mkpits.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException {
//      for BufferReader
//      BufferReader in the form of stream
//      InputStreamReader is use to get system user input 
//      readLine is a method if exception then method with IOException
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name:");
		String name=br.readLine();
		System.out.println("Name:"+name);
		
		System.out.println("Enter age:");
		//typecasting object to primitive
		int age=Integer.parseInt(br.readLine());
		System.out.println("Age:"+age);
//      for scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String myName=sc.next();
		System.out.println(myName);
		
	}

}
