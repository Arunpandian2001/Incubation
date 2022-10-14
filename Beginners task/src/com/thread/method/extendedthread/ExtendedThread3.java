package com.thread.method.extendedthread;

public class ExtendedThread3 extends Thread{

	private String threadName;
	
	
	public ExtendedThread3(String name) {
		this.threadName=name;
	}

	public void run() {
		
			System.out.println("Going to sleep "+ threadName);
			try {
				sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("After sleeping "+ threadName);
			

		
	}
}
