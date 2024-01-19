package com.mkpits.collection;

public class PrintArray4<T>{
//Not Bounded
	public void print(T[] arr) {
		for (T value : arr) {
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		//generic
		Integer [] arr= {2,3,32,13,31,33};
		PrintArray4<Integer> array=new PrintArray4<>();
		//obj.print(variable)
		array.print(arr);
		System.out.println("--------------");
		String []arr1= {"raj","vinay","sanket","ashiq"};
		PrintArray4<String> array1=new PrintArray4<String>();
		array1.print(arr1);
		System.out.println("---------------");
		Double[]arr2= {10.2,12.2,2.1,12.2,11.2};
		PrintArray4<Double> array2=new PrintArray4<Double>();
		array2.print(arr2);
	}

}
