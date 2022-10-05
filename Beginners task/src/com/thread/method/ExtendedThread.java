package com.thread.method;

public class ExtendedThread extends Thread {
	
	private String threadName;
	private long time;
	private boolean value=true;
	
	public boolean isValue() {
		return value;
	}


	public void setValue(boolean value) {
		this.value = value;
	}


	public ExtendedThread(String name) {
		this.threadName=name;
	}
	
	public void setSleepDuration(long time) {
		this.time= time;
	}
	
	public void run() {
		while(value) {
			//ExtendedThread.currentThread().setName(threadName);

			System.out.println("Going to sleep "+ getName());
			try {
				sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			value=false;//7
			System.out.println("After sleeping "+ getName());
			

		}
	}
	
	/*public void run() {
		setName(threadName);//1,3
		System.out.println("Running.."+getName());
		System.out.println("Running.."+getPriority());
		System.out.println("Running.."+getState());
		
	}*/
	
	
	
}
