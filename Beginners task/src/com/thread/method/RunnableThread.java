package com.thread.method;

public class RunnableThread implements Runnable {
	
	private String name;
	private String getThreadPriority;
	private String getThreadState;
	private long time;
	private boolean value=true;

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public RunnableThread (String name) {
		this.name=name;
		//Thread.currentThread().setName(name);
	}
	
	public RunnableThread() {
		this.name=Thread.currentThread().getName();
	}
	public String getThreadName() {
		return name;
	}
	
	
	public int getGetThreadPriority() {
		return Thread.currentThread().getPriority();
	}

	public Thread.State getGetThreadState() {
		return Thread.currentThread().getState();
	}
	
	public void setSleepDuration(long time) {
		this.time= time;
	}

	/*@Override
	public void run() {
		while (value) {
			Thread.currentThread().setName(name);
			
			System.out.println("Going to sleep "+getThreadName());
			try {
				Thread.currentThread();
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("After sleeping "+getThreadName());
			

		}*/
	
		
		public void run() {
			while (value) {
				Thread.currentThread().setName(name);
				System.out.println("Going to sleep "+getThreadName());
				try {
					Thread.currentThread();
					Thread.sleep(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				value=false;//7
				System.out.println("After sleeping "+getThreadName());
				
				}
			}
		
		/*public void run() {
			
			System.out.println("Running...."+Thread.currentThread().getName());//2,3
			System.out.println("Running...."+Thread.currentThread().getPriority());
			System.out.println("Running...."+Thread.currentThread().getState());
			
		}*/
			
	

}
