package com.thread.method.runnablethread;

public class RunnableThread5 implements Runnable{

	private String name;
	private long time;
	private boolean value=true;

	public RunnableThread5 (String name,long time) {
		this.name=name;
		this.time=time;
	}
	
	public String getThreadName() {
		return name;
	}
	
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
			
		}
	}
}
