package com.mkpits.thread;

public class MyThreadS2 extends Thread {
Table t;
	
	public MyThreadS2(Table t) {
		this.t=t;
	}
	
	
	@Override
	public void run() {
		t.printTable(7);
	}
}
