package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterClass {
	//Its is a char oriented 1)FileWriter---	It is use for write
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Data :");
		String str=br.readLine();
		str=str+"\n";
		
		FileWriter fw=new FileWriter("E:\\data.java", true);
		fw.write(str);
		System.out.println("Data Is Written");
		fw.close();
		
	}

}
