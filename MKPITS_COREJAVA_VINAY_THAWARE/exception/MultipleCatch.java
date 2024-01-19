package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleCatch {

	public static void main(String[] args)  {
		
		int num[]=new int[5];
		int num1=10,num2=0;
		try {
			System.out.println(num[5]);
			System.out.println(num1/num2);
			//catch(Exception |Exception object )//if first exception occur then second not read...
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(num[5]);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Name");
		try {
			String name = reader.readLine();
		} catch (ArithmeticException e) {

			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
			//finally :-It is use for close...
		} finally {
			System.out.println("Connection Close");
		}
		

	}
}
