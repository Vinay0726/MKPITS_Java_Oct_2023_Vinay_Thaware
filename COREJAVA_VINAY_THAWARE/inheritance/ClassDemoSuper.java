package com.mkpits.inheritance;

public class ClassDemoSuper extends ClassDemo {
	
	int x=150;
	
	public void getAdd() {
		int z=this.x+super.x;
		System.out.println("Addition is:-"+z);
		System.out.println("Current Class varaible :-"+this.x);
		System.out.println("Super Class Variable :-"+super.x);
	}

}

