package com.mkpits.operators;

public class UnaryOperator {
// Unary Operator
//	Single operands to operates
//	1)Increment    ++increment increase operands value by 1
//	2)Decrement    --decrement decrease operands value by 1
//	two type of increment
//	1)Pre Increment ++x  existing value increment memory allocated then print(use)
//	2)Post Increment x++ original print then increment memory allocated
	
	public static void main(String[] args) {
		
    int num=10;
//  for increment
    System.out.println("For Increment");
    System.out.println(++num);//m-11 p-11 =11
    System.out.println(num++);//p-11 m-12 =11
    System.out.println(++num);//m-12 p-13 =13
    System.out.println(++num);//p-14 m-14 =14
    System.out.println(num++);//p-14 m-15 =14
    System.out.println(num);
    
//	two type of increment
//	1)Pre Decrement --x  existing value decrease memory allocated then print(use)
//	2)Post Decrement x-- original print then decrease memory allocated
//  for Decrement
    System.out.println("For Decrement");
    int dnum=15;
    System.out.println(--dnum);//m-14 p-14 =14
    System.out.println(dnum--);//p-14 m-13 =14
    System.out.println(dnum--);//p-13 m-12 =13
    System.out.println(--dnum);//m-11 p-11 =11
    System.out.println(--dnum);//m-10 p-10 =10
    System.out.println(dnum);
	}

}
