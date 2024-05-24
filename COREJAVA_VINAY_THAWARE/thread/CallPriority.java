package com.mkpits.thread;

public class CallPriority {

	public static void main(String[] args) {
		
		System.out.println("Main Thread is:"+Thread.currentThread().getName());
		ThreadPriorityExample t1=new ThreadPriorityExample();
		t1.setPriority(4);
		ThreadPriorityExample t2=new ThreadPriorityExample();
		t2.setPriority(9);
		ThreadPriorityExample t3=new ThreadPriorityExample();
		t3.setPriority(4);
		
		System.out.println("T1 Priority is:"+t1.getPriority());
		System.out.println("T2 Priority is:"+t2.getPriority());
		System.out.println("T3 Priority is:"+t3.getPriority());
		
		System.out.println("before Priority Thread is:"+Thread.currentThread().getPriority());
		System.out.println("Main Thread is:"+Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(10);
		System.out.println("after setting Priority: "+Thread.currentThread().getPriority());
		
		
	
		

	}

}
