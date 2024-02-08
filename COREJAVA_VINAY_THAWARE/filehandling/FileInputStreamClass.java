package com.mkpits.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClass {

	public static void main(String[] args) throws IOException  {
	//Its is a byte oriented 1)FileInputStream---	It is use for read
		FileInputStream fis=new FileInputStream("E:\\login.java");
		int b=0;
		//integer that ix why "-1"
		while((b=fis.read())!=-1) {
			//type casting in char
			System.out.print("Name :"+(char)b);
		}
		fis.close();

	}

}
