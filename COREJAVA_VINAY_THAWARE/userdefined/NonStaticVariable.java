package com.mkpits.userdefined;

public class NonStaticVariable {
//	NON STATIC only one way 
//	(objref.member)
//	In non static variable we can see (default value).
    public boolean isActive;
    public char fAlphabet;
    public byte myNum;
    public short shortNum;
    public int pinCode;
    public long longNum;
    public float myPointer;
    public double mySalary;
	public static void main(String[] args) {
//		class objectref=new class();
		NonStaticVariable variable=new NonStaticVariable();
		System.out.println("Activated:"+variable.isActive);
		System.out.println("First Alphabet:"+variable.fAlphabet);
		System.out.println("My Number:"+variable.myNum);
		System.out.println("Short Number:"+variable.shortNum);
		System.out.println("PinCode:"+variable.pinCode);
		System.out.println("Long Number:"+variable.longNum);
		System.out.println("My Pointer:"+variable.myPointer);
		System.out.println("My Salary:"+variable.mySalary);
		
	

	}

}
