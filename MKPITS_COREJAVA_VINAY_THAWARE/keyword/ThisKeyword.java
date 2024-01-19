package com.mkpits.keyword;

public class ThisKeyword {
	//its is a global variable it can access everywhere or another class
	//with using thiskeyword local variable value assign to the global variable
    String name,email,password;
    int num1,num2;
    
	//This keyword refer as a current classes variable
    //non static value assign by using this keyword
	public static void main(String[] args) {
		
		ThisKeyword k=new ThisKeyword(5,3);
		
		k.getDetail("Vinay","vinaythaware143@gmail.com","vinay2123");
		k.getData();
		
	}

	public void getData() {
		System.out.println("Name:"+name+" Email:"+email+" Password:"+password);
		
	}

	public void getDetail(String name,String email,String password) {
		this.name=name;
		this.email=email;
		this.password=password;
		
	}
	public ThisKeyword(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		int add=num1+num2;
		System.out.println("Addition:"+add);
		
	}

}
