package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banking {
    static int choice,bal;
    static int amt;
    static BufferedReader br;
    
	public static void main(String[] args) {
		Banking b=new Banking();
		br=new BufferedReader(new InputStreamReader(System.in));
		try {
			char ch = 'y';
			while (ch == 'y' || ch == 'Y') {
		System.out.println("1)Deposit \n2)Withdrawal\n3)Check Balance\nEnter Choice->");
		try {
			choice=Integer.parseInt(br.readLine());
		} catch(IOException e) {
			e.printStackTrace();
		}
		switch (choice) {
		case 1:
			b.getDeposit();
			break;
		case 2:
			b.getWithdrawal();
			break;
		case 3:
			b.getCheckBalance();
			break;

		default:
			System.out.println("Invalid Choice !!!1");
		}
		System.out.println("Do you wish to continue?Y/N");
		ch = (char) br.read();
		br.readLine();
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void getCheckBalance() {
		System.out.println("Yours Account Balance is :-"+bal);
		
	}
	public  void getWithdrawal()throws LessBalanceException {
		System.out.println("Enter Withdrawal Amount :-");
		try {
			this.amt=Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		bal+=amt;
		if(bal<=500) {
			throw new LessBalanceException(bal);
		}
		System.out.println("Your Current Balance is:-"+bal);
	}
	public void getDeposit() {
		System.out.println("Enter Deposit Amount :-");
		try {
			this.amt=Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		bal-=this.amt;
		System.out.println("Your Current Balance is:-"+bal);
		
	
	}

}
