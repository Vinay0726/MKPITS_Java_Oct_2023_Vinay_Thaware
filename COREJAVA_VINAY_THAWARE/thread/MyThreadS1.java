package com.mkpits.thread;

public class MyThreadS1 extends Thread {

	Table t;
	
	public MyThreadS1(Table t) {
		this.t=t;
	}
	
	
	@Override
	public void run() {
		t.printTable(4);
	}
}
