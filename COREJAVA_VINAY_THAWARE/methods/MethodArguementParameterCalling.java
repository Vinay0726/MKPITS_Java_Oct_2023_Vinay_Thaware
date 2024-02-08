package com.mkpits.methods;

public class MethodArguementParameterCalling {

	public static void main(String[] args) {
		MethodWithArguement call=new MethodWithArguement();
//		objref.method(new value);
		call.getfirstName("Vinayy");
		 call.getlastName("Thawaree");
		 call.getmyEmail("vinay@12345");
		 call.getmyGender("male");
		 call.getmyMobile(9298828277l);
		 call.getmyPassword("vinay@13242");
//		 add new string & value
		 String newFName="Vinayyy";
         System.out.println("New First Name:"+newFName);
	}
         
}
