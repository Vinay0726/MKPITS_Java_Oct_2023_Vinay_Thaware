package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayLIstAddDataIndex {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<String> colorlist=new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Enter Color Name :-");
				String color;
				
					color = br.readLine();
				colorlist.add(color);
			}
		System.out.println("Enter Index number you want to add");
	    int index=Integer.parseInt(br.readLine());
	    System.out.println("Enter Adding Color Name :-");
	    String indexColor=br.readLine(); 
	    colorlist.set(index-1, indexColor);
	    for (String s : colorlist) {
			System.out.println(s);
		
	}	
}
}	    

		
	


