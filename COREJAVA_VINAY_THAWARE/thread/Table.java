package com.mkpits.thread;

public class Table {

	
	synchronized public void printTable(int n) {
		
//		synchronized (this) {
			for (int i = 1; i <=10; i++) {
				System.out.println(n*i);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
//		}

	}
}
