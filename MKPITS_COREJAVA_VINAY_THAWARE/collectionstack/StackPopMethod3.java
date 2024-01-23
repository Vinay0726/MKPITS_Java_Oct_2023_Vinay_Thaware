package com.mkpits.collectionstack;

import java.util.Stack;

public class StackPopMethod3 {
//Pop=>It will out last Element//It is use for removing the element.
	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		list.push(2);
		list.push(6);
		list.push(3);
		list.push(9);
		//list.push(1,2);//not push using index
		
		System.out.println("After Push:"+list);
		
		list.pop();
		System.out.println("After Pop::"+list);
		list.pop();
		System.out.println("After Pop::"+list);
		
		//Print all who is out from last...
		while(!list.empty()) {
			System.out.println("From Last out:"+list.pop());
		}
		

	}

}
