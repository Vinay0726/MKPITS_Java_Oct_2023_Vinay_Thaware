package com.mkpits.math;

public class MathClass {

	public static void main(String[] args) {
		MathClass m=new MathClass();
		m.mathMethod();

	}

	public void mathMethod() {
		//The double value that is closer than any other to e, the base of the natural logarithms.
		System.out.println(Math.E);
		
		//it returns pie value 3.14
		System.out.println(Math.PI);
		
		//Returns the absolute value
		System.out.println(Math.abs(12.00));
		System.out.println(Math.abs(9828882828l));
		System.out.println(Math.abs(65));
		
		//Returns the mathematical absolute value of an int value if it is exactly representable 
		//as an int ,throwing ArithmeticException if the result overflows the positive int range.
		System.out.println(Math.absExact(24));
		System.out.println(Math.absExact(8883773737l));
		
		//Returns the arc cosine of a value; the returned angle is in the range 0.0 through pi.
		System.out.println(Math.acos(0.0));
		
		//Returns the sum of its arguments
		System.out.println(Math.addExact(20, 50));
		System.out.println(Math.addExact(81818818l, 071717717l));
		
		//Returns the multiply value
		System.out.println(Math.multiplyExact(5, 6));
		
		//Returns the subtract value
		System.out.println(Math.subtractExact(40, 15));
		
	    //Returns the cube root of a double value.
		System.out.println(Math.cbrt(63));
		
		//Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
		System.out.println(Math.ceil(73));
		
				
		//Returns the first floating-point argument with the sign of the second floating-point argument.
		System.out.println(Math.copySign(26, 67));
		
		//return square root
		System.out.println(Math.sqrt(25));
		
		//Returns the argument decrement by one
				System.out.println(Math.decrementExact(10));
				
		//Returns the argument incremented by one
		System.out.println(Math.incrementExact(5));
		
		//Returns the greater  values.
		System.out.println(Math.max(15,10));
		//Returns the smaller  values.
		System.out.println(Math.min(54, 20));
		
		//Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.
		System.out.println(Math.floor(20));
		
		//Returns sqrt(x2 +y2) without intermediate overflow or underflow.
        System.out.println(Math.hypot(5, 6));
		
	}

}
