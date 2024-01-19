package com.mkpits.operators;

public class ArithmeticOperator {
//    Arthmetic operator +,-,*,/
	//binary operator
//	  Two operands to operate
//	x+y(x & y are operands)
	public static void main(String[] args) {
		
		ArithmeticOperator operator=new ArithmeticOperator();
	    operator.add();
		operator.sub();
		operator.mul();
		operator.div(30,3);

	}



public int div(int a, int b) {
	int c=a/b;
	System.out.println("Division is "+c);
	return c;
	
}



public int mul() {
	int a=7;
	int b=10;
	int c=a*b;
	System.out.println("Multiplictaion "+c);
	return c;	
		
	}

public int sub() {
	int a=30;
	int b=10;
	int c=a-b;
	System.out.println("Substraction is "+c);
	return c;
	
}

public int add() {
	int a=5;
	int b=10;
	int c=a+b;
	System.out.println("Addition is "+c);
	return c;
	
	
}

}
