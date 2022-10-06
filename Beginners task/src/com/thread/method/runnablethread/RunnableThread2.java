package com.thread.method.runnablethread;

public class RunnableThread2 implements Runnable{

	private String name;
	
	public String getThreadName() {
		return Thread.currentThread().getName();
	}
	
	public RunnableThread2(String name) {
		this.name=name;
	}
	public void run() {
		Thread.currentThread().setName(name);
		System.out.println("Running...."+Thread.currentThread().getName());
		System.out.println("Running...."+Thread.currentThread().getPriority());
		System.out.println("Running...."+Thread.currentThread().getState());
		
	}
}
