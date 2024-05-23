package com.mkpits.thread;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread();
		t1.start();
		t1.join();
		
		
		MyThread t2=new MyThread();
		t2.start();
	}

}
