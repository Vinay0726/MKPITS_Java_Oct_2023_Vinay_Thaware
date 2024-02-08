package com.mkpits.methods;

public class MethodOverloading {
// more than one method having different arguement
// arguement interchange with datatype like (int a ,float b) change (float b,int a)
//	But not same datatype like(int a,int b)
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.getData();
		System.out.println("Last Name:"+m.getData("Thaware"));
		m.getData(1,440013);
		m.getData(2,"vinaythaware143@gmail.com","vinay@123");
		m.getData(3,440013);
		m.getData(440013,9373007087l);
		m.getData(9373007087l,440013);
	    m.getData(1,"Vinay Thaware",937307087l,"vinaythaware143@gmail.com",440013);

	}
	
	public void getData(int id, String name, long number, String email, int pinCode) {
	System.out.println("ID:"+id+" Name:"+name+" Mobile:"+number+" Email:"+email+" Pincode"+pinCode);
	System.out.println(id+name+number+email+pinCode);
}

	public long getData(long mobile,int pinCode) {
		System.out.println(" Mobile:"+mobile +" Pincode:"+pinCode);
		return mobile+pinCode;
		
	}
	
	public long getData(int pinCode, long mobile) {
		System.out.println(" PinCode:" +pinCode +" Mobile:"+mobile);
		return pinCode+mobile;
		
	}
	
	public int getData(int id, short pinCode) {
		System.out.println("ID:" +id +" PinCode:" +pinCode);
		return id+pinCode;
		
	}

	public String getData(int id, String email, String password) {
		System.out.println("ID:"+id +" Email:"+email +" Password:"+password);
		return id+email+password;
		
	}

	public int getData(int id, int pinCode) {
		System.out.println("ID:" +id +" PinCode:" +pinCode);
		return id+pinCode;
		
	}

	public String getData(String lname) {
		return lname;
		
	}

	public static void getData() {
		String fName="Vinay";
		System.out.println("First Name:"+fName);
		}

}
