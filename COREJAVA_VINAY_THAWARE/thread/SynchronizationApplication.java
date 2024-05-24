package com.mkpits.thread;

public class SynchronizationApplication {

	public static void main(String[] args) {
		
		Table table1=new Table();
		
		MyThreadS1 t1=new MyThreadS1(table1);
		MyThreadS2 t2=new MyThreadS2(table1);
		t1.start();
		t2.start();

	}

}
