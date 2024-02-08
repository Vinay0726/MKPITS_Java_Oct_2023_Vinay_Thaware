package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
//Its is a char oriented 1)FileReader---	It is use for read
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("E:\\data.java");
		BufferedReader br=new BufferedReader(fr);
		String data="";
		//integer that ix why "null"
		while((data=br.readLine())!=null) {
			
		    System.out.println(data);
		}
		br.close();

	}

}
