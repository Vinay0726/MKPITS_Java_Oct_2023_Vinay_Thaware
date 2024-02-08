package com.mkpits.generics;

import com.mkpits.cfs.forTable;

class PrintArray<T>{
	 //Not Bound To any Datatype
	 
	public void print(T[]arr) {
		for (T value : arr) {
			System.out.println("value:-"+value);
		}
	}
}
