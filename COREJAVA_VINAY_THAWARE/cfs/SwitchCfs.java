package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwitchCfs {
    String holderName,accountType,gender,mobile,age,email;
	int pin,accountNumber;
	float cMoney,dMoney,uMoney,withdrawal;
	 
	  
    static BufferedReader br;
    static SwitchCfs s;
	public static void main(String[] args) throws NumberFormatException, IOException {
		 br=new BufferedReader(new InputStreamReader(System.in));
		 s=new SwitchCfs();
		
		char ch='Y';
		//using while loop fetch old data
		while(ch=='Y'|| ch=='y') {
		System.out.println("1)Create Account\n2)Deposit\n3)Withdraw\n4)Check Balance\n5)Account Details");
		 System.out.println("Enter Choice:-");
		 int choice=Integer.parseInt(br.readLine());
		 switch(choice) {
		case 1:
			
			s.createAccount();
			
			
			break;
		
		case 2:
			
			s.Deposit();
			
			break;
			
		case 3:
			
			s.withDraw();
			
			break;
			
         case 4:
			s.checkBalance();
			
			break;
			
         case 5:
 			s.accountDetails();
 			
 			break;
			
       default:
    	   System.out.println("Invalid Choice");
			break;

		}
		 //using while loop
		 System.out.println("Do You Wish to Continue Y/N");
			ch=(char)br.read();
			br.readLine();
		}
	}
	public void accountDetails()throws NumberFormatException, IOException {
		System.out.println("-------------------------------------");
		System.out.println("Account Holder Name is:-"+holderName);
		System.out.println("Account type is:-"+accountType);
		System.out.println("Current Balance is:-"+cMoney);
		System.out.println("Age:-"+age+"Gender:-"+gender);
		System.out.println("Mobile no:-"+mobile);
		System.out.println("Email is:-"+email);
		System.out.println("-------------------------------------");
	}
	public void checkBalance(){
		System.out.println("Account Holder Name is:-"+holderName);
		System.out.println("Account type is:-"+accountType);
		System.out.println("------------------------------------");
		System.out.println("Current Balance is:-"+uMoney);
		System.out.println("------------------------------------");
		
		
	}
	public void withDraw() throws NumberFormatException, IOException {
		System.out.println("-------------------------------------");
		System.out.println("Account Holder Name is:-"+holderName);
		System.out.println("Account type is:-"+accountType);
		System.out.println("Current Amount is:-"+cMoney);
		System.out.println("------------------------------------");
		System.out.println("Enter Withdrawal Amount :-");
		withdrawal=Float.parseFloat(br.readLine());
		uMoney=cMoney-withdrawal;
		if(cMoney<uMoney) {
			System.out.println("Insufficient Balance");
		}else {
		System.out.println("Current Amount is:-"+uMoney);
		
		}
		
	}
	public void Deposit() throws NumberFormatException, IOException {
		System.out.println("-------------------------------------");
		System.out.println("Account Holder Name is:-"+s.holderName);
		System.out.println("Account type is:-"+s.accountType);
		System.out.println("Your Account Number is:-"+accountNumber);
		System.out.println("------------------------------------");
		System.out.println("Enter Your Pin :-");
		pin=Integer.parseInt(br.readLine());
		if(pin==1234) {
			System.out.println("Current Amount is:-"+cMoney);
			System.out.println("Enter Amount to Deposit:-");
			dMoney=Float.parseFloat(br.readLine());
			uMoney=cMoney+dMoney;
			System.out.println("Current Balance is:-"+uMoney);
		}
		else {
		
		System.out.println("Invalid Pin");
		}
		
	}
	public void createAccount() throws IOException {
		System.out.println("-------------------------------------");
		System.out.println("Enter Your Name:-");
		holderName=br.readLine();
		
		System.out.println("Enter Account type (Saving/Current:-");
		accountType=br.readLine();
		
		System.out.println("Enter Age:-");
		age=br.readLine();
		
		System.out.println("Enter your gender");
		gender=br.readLine();
		
		System.out.println("Enter Mobile number:-");
		while(true) {
		mobile=br.readLine();
		if (!mobile.matches("\\d+")||mobile.length()!=10||mobile.isEmpty()) {
		    System.out.println("Invalid Mobile Number!! Please enter only digits.");
		    continue;
		}
		break;
		}
		
		System.out.println("Enter your Email:-");
		email=br.readLine();
		
		//Regular Expression  
		String regex="^(.+)@(.+)$";
		//Compile regular expression to get the pattern 
		Pattern pattern=Pattern.compile(regex);
		//Create instance of matcher 
		Matcher matcher=pattern.matcher(email);
		
		if(!matcher.matches()) {
			System.out.println("Email invalid");
		}
	
		
		System.out.println("Enter Current Amount:-");
		cMoney=Float.parseFloat(br.readLine());
		
//		for using math 
		accountNumber=(int)Math.floor(Math.random()*1000000);
		System.out.println("Account Number is :-"+accountNumber);
		System.out.println("-------------------------------------");
		System.out.println("Account Created Successfully :)");
		
		
		
		
		
	}
}

