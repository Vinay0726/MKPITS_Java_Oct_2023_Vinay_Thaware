package com.mkpits.operators;

public class AssignmentOperator {
// Assignment Operator +=,-=,*=,%=,/=
	//x+=y=x+y;x-=y,x*=y,x/=y,x==y;
//	                  int x=5 x+=15 =x+y 5+15
	public static void main(String[] args) {
		AssignmentOperator assign=new AssignmentOperator();
		System.out.println("Assigned x+=y /(x+y) is "+assign.asAdd());
		System.out.println("Assigned x-=y /(x-y) is "+assign.asSub());
		assign.asMul();
		assign.asDiv();
		assign.asEqual();


	}

	public int asAdd() {
		int x =5;
		x+=20;
		return x;
		
	}
	public int asSub() {
		int x =40;
		x-=25;
		return x;
		
	}
	public int asMul() {
		int x=50;
		x*=1;
		System.out.println("Assigned x*=y /(x*y) is "+x);
		return x;
		
	}
	public void asDiv() {
		int x =40, y=20;
		System.out.println("Assigned x/=y /(x/y) is "+(x/=y));
		
	}
	public void asEqual() {
		int x=5,y=6;
		System.out.println("Assigned x==y /(x=y) is "+(x==y));
		
	}
	
		
	}

