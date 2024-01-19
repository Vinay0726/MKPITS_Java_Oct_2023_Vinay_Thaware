package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeGunWater {
	static String sysInput;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("------------------");
		System.out.println("Welcome Snake Water Game");
		char ch='Y';
		//using while loop fetch old data
		while(ch=='Y'|| ch=='y') {
	    System.out.println("Enter 1-32=s \n 33-65=w \n 66-99=g");
		int random=Integer.parseInt(br.readLine());
		random=Integer.parseInt(br.readLine());
		
		if(random>1 && random<33) {
			sysInput="s";
		}
		if(random>33 && random<66) {
			sysInput="w";
		}
		if(random>66 && random<100) {
			sysInput="g";
		}
		
		
	    if((sysInput.equalsIgnoreCase("w"))) {
	    System.out.println("Snake win ");
	    }
	    
	    
	    System.out.println("Do you wish to continue y/n");
	    ch=(char)br.read();
	    br.readLine();
	    
	}
	}
}

