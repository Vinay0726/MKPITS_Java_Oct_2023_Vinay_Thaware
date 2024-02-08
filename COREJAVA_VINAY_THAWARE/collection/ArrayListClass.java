package com.mkpits.collection;

import java.util.ArrayList;

public class ArrayListClass {
//ArrayList-It is a predefined Class ...It takes any type of datatype ...
//Size ->10.. if more than 10 then formula=size/2+1 then adding this answer
	public static void main(String[] args) {
     //Non Generics - //object will be return //<> not use....
		ArrayList list=new ArrayList();
		list.add(353);
		list.add(24);
		list.add("vinay");
		list.add(10.3);
		
		for (Object data : list) {
			System.out.println("List is :-"+data);
		}
	//In this we cannot easily typecaste.... 
    //  int num=list.get(0);
	 //get -> method to get data
		int num=(Integer)list.get(0);
		System.out.println("Index :-"+num);
	
	
	}

}
