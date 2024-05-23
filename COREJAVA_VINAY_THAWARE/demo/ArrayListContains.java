package com.mkpits.demo;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ArrayListContains {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		ArrayList<String> reslut=new ArrayList<String>();
		list1.add("red");list1.add("white");
		list2.add("red");list2.add("blue");
		ArrayList<String> result=new ArrayList<String>();
		for (String e : list1) {
			result.add(list2.contains(e)?"yes":"no");
		}

	}

}
