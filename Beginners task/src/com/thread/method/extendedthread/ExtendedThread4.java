package com.thread.method.extendedthread;

public class ExtendedThread4 extends Thread{

	private String threadName;
	private long time;
	
	
	public ExtendedThread4(String name,long time) {
		this.threadName=name;
		this.time= time;

	}
	
	public void run() {
		
		System.out.println("Going to sleep "+ threadName);
		try {
			sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("After sleeping "+ threadName);
		
	}
}
