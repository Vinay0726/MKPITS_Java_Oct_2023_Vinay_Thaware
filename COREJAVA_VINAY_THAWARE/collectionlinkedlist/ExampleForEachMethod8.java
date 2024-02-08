package com.mkpits.collectionlinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleForEachMethod8 {

	public static void main(String[] args) {
		 // Creating a LinkedList of Integer Type 
        LinkedList<Integer> linkedList = new LinkedList<>(); 
  
        // Inserting some Integer values to our LinkedList 
        linkedList.add(1); 
        linkedList.add(2); 
        linkedList.add(3); 
        linkedList.add(4); 
        linkedList.add(5); 
   
  
        // Calling the forEach function to iterate through 
        // all the elements inside the Linked List 
        linkedList.forEach( 
            (element) -> System.out.print(element + " ")); 
    } 


	}


