package com.mkpits.cfs;

public class NestedForLoop {

	public static void main(String[] args) {
		
		
		
		for(int i=0;i<=5;i++) {
			System.out.println("Outer Loop :"+i);
			for(int j=1;j<=5;j++) {
				System.out.println("Inner Loop :"+j);
				
			}
			
		}

		for(int i=0;i<=4;i++) {
			//0uter loop for row
			
			for(int j=1;j<=i;j++)
			//Inner loop for column
				{
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
