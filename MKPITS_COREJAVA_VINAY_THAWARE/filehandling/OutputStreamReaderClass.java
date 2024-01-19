package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputStreamReaderClass {
	//Its is a byte oriented 1)FileOutputStream---	It is use for write
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name :");
		String name=br.readLine();	
		name=name+"\n";
        //if we append booleans type "True" it will be previous data add new data...	
		// if we append booleans type "false" it will be remove previous data add new data..
		FileOutputStream fos=new FileOutputStream("E:\\login.java", true);
		byte b[]=name.getBytes();
		fos.write(b);
		System.out.println("Data is written");
		fos.close();
	}

}
