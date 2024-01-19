package com.mkpits.methods;

public class MethodDeclaration {
      
	public static void main(String[] args) {
//		Direct Access
//		method();
		getFirstName();
		getLastName();
		getEmail();
		getMobile();
		getGender();
		getPassword();
		
	}
	

   public static void getAllData() {
	getFirstName();
	getLastName();
	getEmail();
	getMobile();
	getGender();
	getPassword();
		
	}


//    Declare return type if not use void
//	  method name- any valid name but not keyword
//	()- for arguements
//	{}- method body
	
	public static void getPassword() {
		String myPassword="Vinay@123";
		System.out.println("Password:"+myPassword);
		
	}

	public static void getGender() {
		String myGender="Male";
		System.out.println("Gender:"+myGender);
		
	}

	public static void getMobile() {
		long myMobile=9373007087L;
		System.out.println("Mobile:"+myMobile);
		
	}

	public static void getEmail() {
		String myEmail="vinaythaware143@gmail.com";
		System.out.println("Email:"+myEmail);
		
	}

	public static void getLastName() {
		String myLastName="Thaware";
		System.out.println("Last Name:"+myLastName);
		
	}

	public static void getFirstName() {
		String myFirstName="Vinay";
		System.out.println("First Name:"+myFirstName);
		
	}

}
