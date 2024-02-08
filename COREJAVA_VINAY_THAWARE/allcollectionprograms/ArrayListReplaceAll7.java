package com.mkpits.allcollectionprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReplaceAll7 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println(list);
		list.replaceAll(e->e.toUpperCase());
		System.out.println(list);

	}

}
