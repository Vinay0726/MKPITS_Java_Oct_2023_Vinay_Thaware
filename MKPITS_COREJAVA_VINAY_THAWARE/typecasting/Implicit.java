package com.mkpits.typecasting;

public class Implicit {

	public static void main(String[] args) {
//type casting= one datatype value to another dataype
//Implicit (automatic)
//small datatype value assign in a larger datatype
//it is not reversible
//byte<short<int<long<float<double
		byte num=24;
		short num1=num;
		System.out.println("byte value into short"+num1);
		int n1=10,n2=10;
		int addtion=n1+n2;
		long n3=n1+n2;
		System.out.println("integer to long"+n3);
		long myPincode=440013;
		long myPincode1=myPincode;
		double myPin=myPincode;
		System.out.println("long to double"+myPincode1);
		System.out.println(myPin);
		
//      cannot value assign short in short
	//	short a=10,b=20;
		//short c=a+b;

	}

}
