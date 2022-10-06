package com.thread.method.runnablethread;

public class RunnableThread3 implements Runnable{

	private String name;

	public RunnableThread3 (String name) {
		this.name=name;
	}
	public void run() {
		
			Thread.currentThread().setName(name);
			System.out.println("Going to sleep "+name);
			try {
				Thread.currentThread();
				Thread.sleep(45000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("After sleeping "+name);
			
			
		}

}
