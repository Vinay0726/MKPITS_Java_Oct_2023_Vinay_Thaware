package com.mkpits.methods;

public class MethodReturtypeArguement {
//	 Method with return type & Arguement

	public static void main(String[] args) {
		MethodReturtypeArguement test=new MethodReturtypeArguement();
		String uValue=test.getDetails(1,10000);
		System.out.println(uValue);
		

	}

	public String getDetails(int id, int salary) {
		double incentive=salary+(salary*0.1);
	    String details="Id is:"+id+"\nSalary with incentive is:"+incentive;
		return details;
	}

}
