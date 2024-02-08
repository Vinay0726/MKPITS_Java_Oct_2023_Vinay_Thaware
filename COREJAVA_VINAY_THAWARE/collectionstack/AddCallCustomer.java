package com.mkpits.collectionstack;

import java.util.ArrayList;

public class AddCallCustomer {

	public static void main(String[] args) {
		
		ArrayList<Customer> cus1=new ArrayList<>();
		
		cus1.add(new Customer("Vinay",101, "Nagpur"));
		cus1.add(new Customer("Raj",102, "Nagpur"));
		cus1.add(new Customer("	Sanket",103, "Amravati"));
		
        ArrayList<Customer> cus2=new ArrayList<>();
		
		cus2.add(new Customer("Vinay",101, "Nagpur"));
		cus2.add(new Customer("Pranav",102, "Nagpur"));
		cus2.add(new Customer("Ashiq",103, "Nagpur"));
		
		
		System.out.println("--------------");
		System.out.println("After Add All->");
		cus1.addAll(cus2);
		
		for (Customer customer : cus1) {
			System.out.println(customer);
		}
		
//		System.out.println("--------------");
//		System.out.println("After Remove All->");
//		cus1.removeAll(cus2);
//		for (Customer customer : cus1) {
//			System.out.println(customer);
//		}
		
		System.out.println("--------------");
		System.out.println("After Contains All->");
		cus1.containsAll(cus2);
		for (Customer customer : cus2) {
			System.out.println(customer);
		}
		
		
		
	}

}
