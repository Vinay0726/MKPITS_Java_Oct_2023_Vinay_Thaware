package com.mkpits.typecasting;

public class Explicits {
//Explicit=manually or narrowing
	public static void main(String[] args) {
// 1) Typecasting between primitive to primitive
// datatype variable=(datatype)variable/ or expression
		System.out.println("Type Casting primitive to primitive :-");
		long mobile=8282929928l;
		int newMobile=(int)mobile;
		System.out.println("long to int:"+newMobile);
		int num=160;
		long num1=(long)num;
		System.out.println("int to long:"+num1);
//		in explicits value assign short to short
		short lastNum=7262;
		short uNum=(short)lastNum;
		System.out.println("short to short:"+uNum);
		
		
// 2)Typecasting between object to primitive
		System.out.println("Type Casting object to primitive :-");
		String price="8288";
		int myPrice=Integer.parseInt(price);
		System.out.println("PRICE:"+myPrice);
		String pointer="8.5";
		float newPointer=Float.parseFloat(pointer);
		System.out.println("Pointer:"+newPointer);
		
		
// 3)Typecasting primitive to object
	System.out.println("Type Casting primitive to object :-");
    int pinCode=440013;
    Integer p=new Integer(pinCode);
    System.out.println(p);
    long n=new Long(pinCode);
    System.out.println(n);
    int point=8;
    float nPointer=new Float(point);
    System.out.println(nPointer);
    
    
		
	}	

}
