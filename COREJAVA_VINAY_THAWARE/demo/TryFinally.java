package com.mkpits.demo;


public class TryFinally {

	public static void main(String[] args) {
		 // array of size 4.
        int[] arr = new int[4];
         
        try
        {
            int i = arr[4];
                 
            System.out.println("Inside try block");
        }
         
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception caught in catch block");
        }
         
        finally
        {
            System.out.println("finally block executed");
        }
         
	}
}
