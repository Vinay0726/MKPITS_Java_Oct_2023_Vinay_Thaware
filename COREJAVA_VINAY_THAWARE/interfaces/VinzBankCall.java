package com.mkpits.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VinzBankCall implements VinzBank {
    static BufferedReader br;
    String name,accountType,city,gender,deposit,withdrawal,email,age,pincode,mobile;
	double sWithdrawal,uAmount;
    int otp,cOtp;
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		VinzBankCall call=new VinzBankCall();
		br=new BufferedReader(new InputStreamReader(System.in ));
		System.out.println("-------------------------");
		System.out.println("Welcome To Vinz Bank :)");
		System.out.println("-------------------------");
		
		System.out.println("Enter Your Choice :-");
		char ch='y';
		while (ch=='y'||ch=='Y') {
		System.out.println("1)Create Account \n2)Deposit \n3)Withdrawal \n4)Check Balance \n5)Account Details");
		int choice=Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			call.createAccount();
			break;
		case 2:
			call.deposit();
			break;
		case 3:
			call.withDrawal();
			break;
		case 4:
			call.CheckBalance();
			break;
		case 5:
			call.Details();
			break;
		default :
			System.out.println("Invalid Choice !!!");
		}
		System.out.println("Do You Wish To Continue Y/N");
		ch=(char)br.read();
		br.readLine();
		}
		
	}
    
	    
	
	@Override
	public void createAccount() throws IOException {
		while(true) {
		System.out.println("Enter Holder Name :-");
		name=br.readLine();
		if(name.isEmpty()) {
			System.out.println("Invalid name !!!");
			continue;
		}
		 break;
		}
		while(true) {
		System.out.println("Enter Account type Saving/Current :-");
		accountType=br.readLine();
		if(name.isEmpty()) {
			System.out.println("Invalid AccountType !!!");
			continue;
		}
		 break;
		}
		while(true) {
		System.out.println("Enter Age :-");
		age=br.readLine();
		if (!age.matches("\\d+")||age.isEmpty()) {
		    System.out.println("Invalid Age!!");
		    continue;
		}
		 break;
		}
		while(true) {
		System.out.println("Enter Gender :-");
		gender=br.readLine();
		if(gender.isEmpty()) {
			System.out.println("Invalid Gender");
			continue;
		}
		break;
		}
		while(true) {
		System.out.println("Enter City :-");
		city=br.readLine();  
		if(city.isEmpty()) {
			System.out.println("Invalid City");
			continue;
		}
		break;
		}
		while(true) {
		System.out.println("Enter Pincode :-");
		pincode=br.readLine();
		if (!pincode.matches("\\d+")||pincode.isEmpty()) {
		    System.out.println("Invalid Age!!");
		    continue;
		}
		 break;
		}
		
		while(true) {
		System.out.println("Enter Mobile Number :-");
		mobile=br.readLine();
		if (!mobile.matches("\\d+")||mobile.isEmpty()) {
		    System.out.println("Invalid Age!!");
		    continue;
		}
		 break;
		}
		while(true) {
		System.out.println("Enter Email :-");
		email=br.readLine();
		String regex="^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
	
		if(!matcher.matches()||email.isEmpty()) {
			System.out.println("Email invalid");
			continue;
		}
		    break;
		}
		
		
		otp=(int)Math.floor(Math.random()*10000);
		System.out.println("Your Otp is :-"+otp);
		System.out.println("Enter your Confirm Otp :- ");
		cOtp=Integer.parseInt(br.readLine());
		if(otp==cOtp) {
			System.out.println("Login Successful !! :)");
		}else {
			System.out.println("Otp is invalid !!!");
		}	
		
	}

	@Override
	public void deposit() throws IOException{
		System.out.print("Name :"+name);
		System.out.println("   Account Type :"+accountType);
		System.out.print("Enter Amount for Deposit:-");
		deposit=br.readLine();
		uAmount=Double.parseDouble(deposit);
		System.out.println("Your Current Balance is :"+uAmount);
		
	}

	@Override
	public void withDrawal() throws IOException {
		System.out.println("-----------------------------");
		System.out.print("Name :"+name);
		System.out.println("    Account Type :"+accountType);
		System.out.print("Enter Withdrawal Amount:-");
		withdrawal=br.readLine();
		sWithdrawal=Double.parseDouble(withdrawal);
		uAmount=uAmount-sWithdrawal;
		System.out.println("Your Current Balanace is "+uAmount);
		System.out.println("-----------------------------");
		
		
		
	}

	@Override
	public void CheckBalance() {
		System.out.println("-----------------------------");
		System.out.print("Name :"+name);
		System.out.println("     Account Type :"+accountType);
		System.out.println("Your Current Balance is "+uAmount);
		System.out.print("-----------------------------");
		
	}

	@Override
	public void Details() {
		System.out.println("-----------------------------");
		System.out.println(" Your Account Detail :) ");
		System.out.println("-----------------------------");
		System.out.print("Name :"+name);
		System.out.println("   Account Type :"+accountType);
		System.out.print("Age :"+age);
		System.out.println("   Gender : "+gender);
		System.out.print("City :"+city);
		System.out.println("   Pincode :"+pincode);
		
		System.out.println("Your Current Balanace is "+uAmount);
		System.out.println("-----------------------------");
		
		
	}

}
