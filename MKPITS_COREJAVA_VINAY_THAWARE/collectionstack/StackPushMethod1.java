package com.mkpits.collectionstack;

import java.util.Stack;

public class StackPushMethod1 {

//Stack-is a predefined class ..It Use (LIFO)..
//LIFO=>If we add Element it will add in last(Last In) then it will out first(first out)..
//Push--It add in last ..For Adding The element
	public static void main(String[] args) {
		
		Stack<Integer> list=new Stack<>();
		list.push(2);
		list.push(6);
		list.push(3);
		list.push(9);
		//list.push(1,2);//not push using index
		
		System.out.println(list);
		

	}

	}


