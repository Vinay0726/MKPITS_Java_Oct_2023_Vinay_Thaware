package com.mkpits.interthreadcomm;

public class Waiter implements Runnable {

	private Message msg;
	public Waiter(Message m) {
		this.msg=m;}
	
	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		synchronized (msg) {
			System.out.println(name+" Started Waiting to get notified at :"+System.currentTimeMillis());
			try {
				msg.wait();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			System.out.println(name+" waiter thread got "+"notified at: "+System.currentTimeMillis());
			//process the messge now
			System.out.println(name+" processed: "+msg.getMsg());
		}
	}

}
