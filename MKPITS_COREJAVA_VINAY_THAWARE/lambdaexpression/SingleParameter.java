package com.mkpits.lambdaexpression;

import java.util.ArrayList;

public class SingleParameter {
//With Using For Each
	public static void main(String[] args) {
		
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(6);
	list.add(4);
	list.add(9);
	list.add(1);
	
	list.forEach(n->System.out.println(n));
    
	System.out.println("---------");
	//This is best way to print list
	list.forEach(System.out::println);
	
	System.out.println("-----");
	list.forEach(n->{
		if(n%2==0) {
			System.out.println("Even Number is:"+n);
		}
	});
	

	}

}
