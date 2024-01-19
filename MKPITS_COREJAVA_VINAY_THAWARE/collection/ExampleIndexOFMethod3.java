package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleIndexOFMethod3 {

	public static void main(String[] args) {
		
		List<Integer> num=new ArrayList<Integer>();
		num.add(12);
		num.add(13);
		num.add(11);
		num.add(12);
		num.add(13);
		
		//indexOf-->Print the first Occurance index ...
		//If having Same Element in list get first Occurance
		//-1->Element Not Found
		System.out.println("Index Of Element 12 is:-"+num.indexOf(12));
		
		//LastIndexOf-->Print the last Occurance ...
		//If having Same Element in list get last Occurance..
		System.out.println("Index Of Element 12 is:-"+num.lastIndexOf(12));
        
		//-1->Element Not Found
		System.out.println("Element Not Found "+num.indexOf(33));
	}

}
