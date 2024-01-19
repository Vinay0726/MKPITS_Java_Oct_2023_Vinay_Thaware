package com.mkpits.filehandling;

import java.io.File;


public class FileListDemo {

	public static void main(String[] args) {
		
	 File f=new File("E:\\mkpits_workspace\\MKPITS_Java_Oct_2023_Vinay_Thaware ");
	 String []str=f.list();
	 for (int i = 0; i < str.length; i++) {
		//file(parent,child) 
		 File f2=new File(f,str[i]);
		 if(f.isDirectory()) {
			 System.out.println(f2.getName()+" is Directory");
		 }
		 else if(f.isFile()){
			 System.out.println(f2.getName()+" is file");
		 }
	}
    
	}
	

}
