package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
  static BufferedReader br;
	public static void main(String[] args) {
	   try {
		FileReader fr=new FileReader("E:\\data.java");
		br=new BufferedReader(fr);
		String data="";
		//integer that ix why "null"
		while((data=br.readLine())!=null) {
			
		    System.out.println(data);
		}
	   }
	   catch(IOException e) {
		   e.printStackTrace();
	   }
	   //Finally :- It is use for Close...//closing DB connection .. 
	   finally {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
       }

	}
}

