package com.thread.method.runnablethread;

public class RunnableThread4 implements Runnable{

	private String name;
	private long time;

	public RunnableThread4 (String name,long time) {
		this.name=name;
		this.time=time;
	}
	
	public String getThreadName() {
		return name;
	}
	
	public void run() {
			
			System.out.println("Going to sleep "+name);
			try {
				Thread.currentThread();
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("After sleeping "+name);
			
			
		}
}
