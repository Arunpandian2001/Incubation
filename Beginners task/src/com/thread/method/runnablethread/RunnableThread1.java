package com.thread.method.runnablethread;

public class RunnableThread1 implements Runnable {
	
	
	public void run() {
			
			System.out.println("Running...."+Thread.currentThread().getName());
			System.out.println("Running...."+Thread.currentThread().getPriority());
			System.out.println("Running...."+Thread.currentThread().getState());
			
		}
			
	

}
