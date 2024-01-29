package com.mkpits.lambdaexpression;

public class CallUser77 {

	public static void main(String[] args) {
		
		UserInput add=(int x,int y)->x+y;
		System.out.println("Addition is:"+add.operate(20, 15));
		UserInput sub=(int x,int y)->x-y;
		System.out.println("Substraction is:"+sub.operate(20, 15));
		UserInput mul=(int x,int y)->x*y;
		System.out.println("Multiplication is:"+mul.operate(20, 15));
		
		
		
		

	}

}
