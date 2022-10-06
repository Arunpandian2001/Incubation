package com.thread.method.extendedthread;

public class ExtendedThread6 extends Thread{

	private String threadName;
	private long time;
	private boolean value=true;
	
	
	public ExtendedThread6(String name,long time) {
		this.threadName=name;
		this.time=time;
	}
	
	
	public void stopMethod() {
		this.value=false;
	}
	
	public void run() {
		
		while(value) {

			System.out.println("Going to sleep "+ threadName);
			try {
				sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("After sleeping "+ threadName);
			

		}
	}
	
}
