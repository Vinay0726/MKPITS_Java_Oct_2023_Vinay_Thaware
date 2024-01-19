package com.mkpits.generics;

class PrintSum <T extends Number> {
	
	public void print(T[]arr) {
		double sum=0;
		for (T val : arr) {
			sum=sum+val.doubleValue();//this method is a class number so we can use it
		}
		System.out.println(sum);
	}
}
