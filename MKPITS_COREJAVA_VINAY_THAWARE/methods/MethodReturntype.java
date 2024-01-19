package com.mkpits.methods;

public class MethodReturntype {
// method with returntype & no arguement
	public static void main(String[] args) {
		
		MethodReturntype test=new MethodReturntype();
//		non static we can call with use of objref
//		static main can easily call static method
		System.out.println("First Name:"+test.getFirstName());
//      new variable assign to hold value
		String lName=test.getLastName();
		System.out.println("Last Name:"+test.getLastName());
		System.out.println("Email:"+test.getEmail());
		System.out.println("Mobile:"+test.getMobile());
		System.out.println("Gender:"+test.getGender());
		System.out.println("Password:"+test.getPassword());
        
	}
	public String getPassword() {
		String myPassword="Vinay@123";
//		return keyword in last statement
//		return type value send same as return type like string,int,long etc
		return myPassword;
	}

	public String getGender() {
		String myGender="Male";
		return myGender;
	}

	public long getMobile() {
		long myMobile=9373007087L;
		return myMobile;
	}

	public String getEmail() {
		String myEmail="vinaythaware143@gmail.com";
		return myEmail;
	}

	public static String getLastName() {
		String myLastName="Thaware";
		return myLastName;
	}

	public String getFirstName() {
		String myFirstName="Vinay";
		return myFirstName;
		
	}


}
