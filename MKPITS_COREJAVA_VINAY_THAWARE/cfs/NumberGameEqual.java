package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class NumberGameEqual {

	public static void main(String[] args) throws IOException {
		
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       //math
		   int randomValue=(int)Math.floor(Math.random()*10);
		   for(int i=1;i<10;i++)  {
			    System.out.println("Random value is:-"+randomValue);
			    int num=Integer.parseInt(br.readLine());
			if(num>randomValue ) {
				System.out.println("Number is Greater");
			}
			if(num<randomValue) {
				System.out.println("Number is Less");
			}
			if(num==randomValue) {
				System.out.println("Value is matched");
				System.out.println("Your attemp is :-"+i);
				break;
				
			} 
			System.out.println("Enter number again :-");
			
			
			  
			}
	}
		
	}

