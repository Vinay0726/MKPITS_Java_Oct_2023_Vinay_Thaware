package com.mkpits.arrays;

public class MultidimentionalArray {
    String[]name;
	public static void main(String[] args) {
		//multi-dimentional an array elements are referred using multiple indexed(matrix)
		//It increase complexity
		String[][]name={ {"mr.","ms."},{"vinay","raj","sam"}};   
		System.out.println("Name :-"+name[0][0]+name[1][0]);
        System.out.println("Name :-"+name[0][0]+name[1][1]);
        System.out.println("Name :-"+name[0][1]+name[1][2]);
	}

}
