package com.mkpits.collectionstack;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import javax.print.attribute.Size2DSyntax;
import javax.swing.text.Element;

import com.mkpits.arrays.ReverseArray;

public class Example {

	public static void main(String[] args) {
		
		
		Stack list=new Stack();
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(6);
		list.add(4);
		list.add(9);
		list.add(5);
		
		
		
		list.push(1);
		System.out.println(list);
		list.pop();
        System.out.println(list);
		
        Collections.sort(list);
	    System.out.println(list); 
	    
	    Set dup=new HashSet<>(list);
	    System.out.println(dup);
//	    dup.addAll(list);
//	    list.clear();
//	    list.add(dup);
//	    System.out.println(list);
	    
	     
	    
	    
	    
//	    Collections.sort(list, Collections.reverseOrder());
//        System.out.println(list);
//         
//        System.out.println(list.get(list.size()/2));
//        System.out.println(list.remove(list.size()/2));
//        System.out.println(list);
//        System.out.println(list.remove(list.lastElement()));
//        
//        System.out.println(list);
       
	}

}
