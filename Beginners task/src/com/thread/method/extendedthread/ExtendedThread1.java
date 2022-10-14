package com.thread.method.extendedthread;

public class ExtendedThread1 extends Thread {
	
	private String threadName;
	
	public ExtendedThread1(String name) {
		this.threadName=name;
	}
	
	public void run() {
		setName(threadName);
		System.out.println("Running.."+getName());
		System.out.println("Running.."+getPriority());
		System.out.println("Running.."+getState());
		
	}
	
	
}
