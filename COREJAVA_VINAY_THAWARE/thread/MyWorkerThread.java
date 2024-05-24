package com.mkpits.thread;
//Concurrency
public class MyWorkerThread extends Thread {
    String task;
    
    public MyWorkerThread(String s) {
    	this.task=s;
    }
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(start) task ="+task);
		processmessage();//call process task method that sleep
		System.out.println(Thread.currentThread().getName()+" End");
	}
	private void processmessage()  {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
