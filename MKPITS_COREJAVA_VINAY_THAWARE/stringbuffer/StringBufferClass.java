package com.mkpits.stringbuffer;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBufferClass b=new StringBufferClass();
		b.stringBufferMethod();
		b.stringBufferConstructor();
		

	}
	
	public void stringBufferMethod() {
		String fName="Vinay";
		StringBuffer fDetails=new StringBuffer(fName);
		String lName="thaware";
		StringBuffer lDetails=new StringBuffer(lName);
		String num="1432";
		StringBuffer nNum=new StringBuffer(num);
		//capacity of string
		
		System.out.println(fDetails.capacity());
		System.out.println(lDetails.capacity());
		//charAt(index) to print character
		System.out.println(fDetails.charAt(2));
		//unique code
		System.out.println(fDetails.codePointAt(1));
		System.out.println(fDetails.compareTo(lDetails));
		System.out.println(fDetails.indexOf(lName));
		//length
		System.out.println(fDetails.length());
		System.out.println(fDetails.toString());
		//Substring is use to get character (start, end)
		System.out.println(fDetails.substring(1, 4));
		// append character means single character add in string
		System.out.println(fDetails.append('y'));
		System.out.println(nNum.append(12));
		//append string (string,from,to)
		//System.out.println(fDetails.append(lDetails, 1, 4));
		//insert after the string with particular index
		//System.out.println(fDetails.insert(6, true));
		System.out.println(fDetails.append(lDetails, 1,5));
		//delete string (start, end)
		System.out.println(fDetails.delete(4, 9));
		System.out.println(fDetails.deleteCharAt(4));
		System.out.println(fDetails.append('y'));
		//replace start to end with string name
		System.out.println(fDetails.replace(1, 4, lName));
		//reverse string
		System.out.println(fDetails.reverse());
		fDetails.trimToSize();
		System.out.println(fDetails);
		System.out.println(fDetails.indexOf(fName));
		System.out.println(fDetails.indexOf(fName, 3));
		System.out.println(fDetails.offsetByCodePoints(2, 4));
		
	}
	public void stringBufferConstructor() {
		String num="142442";
		StringBuffer num1=new StringBuffer("Hello");
		num1.append(" Vinay");
		System.out.println(num1);
		StringBuffer num2=new StringBuffer(num);
		System.out.println(num2.capacity());
		StringBuffer num3=new StringBuffer(num);
		System.out.println(num3);		
	}	
}
