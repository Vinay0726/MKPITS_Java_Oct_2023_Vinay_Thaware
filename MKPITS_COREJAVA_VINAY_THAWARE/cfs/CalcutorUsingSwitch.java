package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcutorUsingSwitch {

	public static void main(String[] args)throws IOException {
		CalcutorUsingSwitch c=new CalcutorUsingSwitch();
		c.calculator();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter num1");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter num2");
		int b=Integer.parseInt(br.readLine());
		int c;
		System.out.println("Enter Choice ->");
		System.out.println(" 1.Addition \n 2.Substraction \n 3.Division \n 4.Multiplication \n 5.Exit");
		int x=Integer.parseInt(br.readLine());
		switch(x)
		{	
			case 1:c=a+b;
				System.out.println("Addition ="+c);
				break;
			case 2:c=a-b;
				System.out.println("Substraction ="+c);
			    break;
			case 3:c=a/b;
				System.out.println("Division ="+c);
				break;
		    case 4:c=a*b;
				System.out.println("Multipication ="+c);
				break;
			case 5: 
			     break;
			default:
				System.out.println("Invalid choice");
		}
		}

	public void calculator() throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter num1");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter num2");
		int b=Integer.parseInt(br.readLine());
		int c;
		System.out.println("Enter Choice ->");
		System.out.println(" 1.Addition \n 2.Substraction \n 3.Division \n 4.Multiplication \n 5.Exit");
		int x=Integer.parseInt(br.readLine());
		switch(x)
		{	
			case 1:c=a+b;
				System.out.println("Addition ="+c);
				break;
			case 2:c=a-b;
				System.out.println("Substraction ="+c);
			    break;
			case 3:c=a/b;
				System.out.println("Division ="+c);
				break;
		    case 4:c=a*b;
				System.out.println("Multipication ="+c);
				break;
			case 5: 
			     break;
			default:
				System.out.println("Invalid choice");
		}
		}

		
	}

	


