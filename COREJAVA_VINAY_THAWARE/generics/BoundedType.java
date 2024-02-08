package com.mkpits.generics;

public class BoundedType {
	//Generic -> <> use of ...
	//Bounded--bounded in Any datatype--limitation --we have to create one datatype one class...second datatype second class..
	//T -Formal Type Arguement.	//Type safety //
	public static void main(String[] args) {
		Integer []num= {1,2,3,4,5,6,7};
		PrintSum<Integer> printArray=new PrintSum<Integer>();
		printArray.print(num);
		String []name= {"vinay","raj","ashik","sanket","chetan","panav"};
		PrintSum<String> printString=new PrintSum<String>();
		printString.print(name);
		
		Double []doubleNum= {10.2,26.82,62.3,52.72};
		PrintSum<Double> printDouble=new PrintSum<Double>();
		printDouble.print(doubleNum);
	}

}
