package com.mkpits.methods;

public class CallGetterSetter {

	public static void main(String[] args) {
	  GetterSetter call=new GetterSetter();
	   call.setMyName("Vinay");
	   System.out.println("Name:"+call.getName());
	   call.setEmail("vinaythaware143@gmail.com");
	   System.out.println("Email:"+call.getEmail());
	   call.setMobile(9373007087l);
	   System.out.println("Mobile"+call.getMobile());

	}

}
