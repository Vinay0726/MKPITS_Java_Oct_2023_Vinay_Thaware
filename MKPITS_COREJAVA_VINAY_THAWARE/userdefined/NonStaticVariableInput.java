package com.mkpits.userdefined;

public class NonStaticVariableInput {
//	NON STATIC only one way 
//	(objref.member)
//	In non static variable we can see (default value).
    public boolean isActive=true;
    public char fAlphabet='v';
    public byte myNum=9;
    public short shortNum=1234;
    public int pinCode=440013;
    public long longNum=252552123l;
    public float myPointer=7.5f;
    public double mySalary=25000.500;
	public static void main(String[] args) {
//		class objectref=new class();
		NonStaticVariableInput variable=new NonStaticVariableInput();
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

