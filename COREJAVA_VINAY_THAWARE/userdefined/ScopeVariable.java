package com.mkpits.userdefined;

public class ScopeVariable {
//	it can call anywhere in the class
// static variable(class variable)
//	it can implement all over the class
//	if static and local having then first priority is local
//	if we have static,local & static block call first static block
//	static block if we call class then we can call every package
//	if we call static block then we can call in class
//	if static and local class same then call local variable only

	static String lastName="Thaware";
	public static void main(String[] args) {
		// local variable(auto variable)
//		it can implement under the method
//		if variable not assign it show error
		String firstName ="Vinay";
		System.out.println("Firstname:"+firstName);
		System.out.println("Last name:"+lastName);
	
	}
//	static block
//	static block call before main method and static then static then local variable 
	static {
		String myPincode ="440013";
		System.out.println("PinCode:"+myPincode);
		
	}
	
}
