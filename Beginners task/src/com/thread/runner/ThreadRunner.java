package com.thread.runner;

import java.util.Scanner;

import com.thread.method.extendedthread.*;
import com.thread.method.runnablethread.*;
import com.util.getvalues.*;

import createdexception.CreatedException;
public class ThreadRunner {

	public static void main(String[] args)  {

		Scanner input=new Scanner(System.in);
		IntegerMethod getInt=new IntegerMethod();
		GetString stringInput=new GetString();
		LongMethod getLong=new LongMethod();
		StringArray stringArrInput =new StringArray();

		
		int choice=getInt.isInteger(input);
		switch(choice) {
			case 1:{
				
				try {
					System.out.println("Enter the name for thread ::");
					String name=stringInput.getString(input);
					ExtendedThread1 ex=new ExtendedThread1(name);
					System.out.println("Before thread");
					System.out.println(ex.getName());
					System.out.println(ex.getPriority());
					System.out.println(ex.getState());
					System.out.println("\n\n");
					ex.start();
					ex.join();
					
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
			}
			
			case 2:{
					
				try {
					
					RunnableThread1 run=new RunnableThread1();
					Thread t1=new Thread(run);
					System.out.println("Before thread");
					System.out.println(t1.getName());
					System.out.println(t1.getPriority());
					System.out.println(t1.getState());
					System.out.println("\n\n");
					t1.start();
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
			}
			
			
			case 3:{
				try {
					ExtendedThread2 ex=new ExtendedThread2("ExtendedThread");

					System.out.println("Before Extended thread");
					System.out.println(ex.getName());
					System.out.println(ex.getPriority());
					System.out.println(ex.getState());
					System.out.println("\n\n");
					
					ex.start();
					ex.join();
					
					System.out.println("\n\n");
					RunnableThread2 run=new RunnableThread2("RunnableThread");
					Thread t1=new Thread(run);
					System.out.println("Before Runnable thread");
					System.out.println(t1.getName());
					System.out.println(t1.getPriority());
					System.out.println(t1.getState());
					System.out.println("\n\n");
					t1.start();
					
					
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
			}
			
			case 4:{
				try {
					System.out.println("Names of Extended Class");
					String extNames[]=stringArrInput.getStringArray(input);

					System.out.println("Names of Runnable Class");
					String runNames[]=stringArrInput.getStringArray(input);
					
					ExtendedThread3[] extendedArray=new ExtendedThread3[extNames.length];
					
					RunnableThread3[] runnableArray=new RunnableThread3[runNames.length];
					
					
					int extNamesNum=extNames.length;
					int runNamesNum=runNames.length;
					
					if( extNamesNum != runNamesNum ) {
						throw new Exception ("The no of inputs entered is unequal");
					}
					
					for (int i = 0; i < extNamesNum; i++) {
						ExtendedThread3 thread =new ExtendedThread3(extNames[i]);
						extendedArray[i]=thread;
						thread.start();
					}
					
					
					for (int j = 0; j < extNamesNum; j++) {
						RunnableThread3 run =new RunnableThread3(runNames[j]);
						runnableArray[j]=run;
						Thread t=new Thread(run);
						t.start();
					}
					
					
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
					
			}
			
			case 5:{
				try {
					System.out.println("Names of Extended Class");
					String extNames[]=stringArrInput.getStringArray(input);

					System.out.println("Names of Runnable Class");
					String runNames[]=stringArrInput.getStringArray(input);
					
					ExtendedThread4[] extendedArray=new ExtendedThread4[extNames.length];
					
					RunnableThread4[] runnableArray=new RunnableThread4[runNames.length];
						
					int extNamesNum=extNames.length;
					int runNamesNum=runNames.length;
					
					if( extNamesNum != runNamesNum ) {
						throw new Exception ("The no of inputs entered is unequal");
					}
					
					
					for (int i = 0; i < extNamesNum; i++) {
						
						System.out.println("Enter the time to sleep for Extended Thread::");
						ExtendedThread4 thread =new ExtendedThread4(extNames[i],getLong.isLong(input));
						extendedArray[i]=thread;
						thread.start();
					}
					
					
					for (int j = 0; j < extNamesNum; j++) {
						
						System.out.println("Enter the time to sleep for Runnable Thread::");
						RunnableThread4 run =new RunnableThread4(runNames[j],getLong.isLong(input));
						runnableArray[j]=run;
						Thread t=new Thread(run);
						t.start();
					}
					
					
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
					

			}
			
			case 6:{
				try {
					System.out.println("Names of Extended Class");
					String extNames[]=stringArrInput.getStringArray(input);

					System.out.println("Names of Runnable Class");
					String runNames[]=stringArrInput.getStringArray(input);
					
					System.out.println("Enter the number of Extended threats to be created ::");
					ExtendedThread5[] extendedArray=new ExtendedThread5[(getInt.isInteger(input))];
					
					System.out.println("Enter the number of Runnable threats to be created ::");
					RunnableThread5[] runnableArray=new RunnableThread5[(getInt.isInteger(input))];
					
					int extNamesNum=extNames.length;
					int runNamesNum=runNames.length;
					
					if( extNamesNum != runNamesNum ) {
						throw new Exception ("The no of inputs entered is unequal");
					}
					for (int i = 0; i < extNamesNum; i++) {

						System.out.println("Enter the time to sleep for Extended Thread::");
						ExtendedThread5 thread =new ExtendedThread5(extNames[i],getLong.isLong(input));
						extendedArray[i]=thread;
						thread.start();
						
					}
					
					
					for (int j = 0; j < extNamesNum; j++) {
						System.out.println("Enter the time to sleep for Runnable Thread::");
						RunnableThread5 run =new RunnableThread5(runNames[j],getLong.isLong(input));
						runnableArray[j]=run;
						Thread t=new Thread(run);
						t.start();

					}
									
					
				}catch(Exception e) {
					System.out.println(e);
				}
				
				break;
					

			}
			
			case 7:{
				try {
					System.out.println("Names of Extended Threads");
					String extNames[]=stringArrInput.getStringArray(input);

					System.out.println("Names of Runnable Threads");
					String runNames[]=stringArrInput.getStringArray(input);
					
					ExtendedThread6[] extendedArray=new ExtendedThread6[extNames.length];
					
					RunnableThread6[] runnableArray=new RunnableThread6[runNames.length];
					

					int extNamesNum=extNames.length;
					int runNamesNum=runNames.length;
					
					if(extNamesNum!=runNamesNum) {
						throw new CreatedException("The number of names of extended and runnable are not same");
					}
					
					for (int i = 0; i < extNamesNum; i++) {
						
						System.out.println("Enter the time to sleep for Extended Thread::");
						ExtendedThread6 thread =new ExtendedThread6(extNames[i],getLong.isLong(input));
						extendedArray[i]=thread;
						thread.start();
						
						System.out.println("Enter the time to sleep for Runnable Thread::");
						RunnableThread6 run =new RunnableThread6(runNames[i],getLong.isLong(input));
						Thread t=new Thread(run);
						runnableArray[i]=run;
						t.start();
					}
										
						for(int i=0;i<extNamesNum;i++) {
							
							Thread.currentThread().sleep(60000);
							extendedArray[i].stopMethod();
							
							Thread.currentThread().sleep(60000);
							runnableArray[i].stopMethod();
							
						}
					
					
				System.out.println("The task is completed");
					
				}catch(Exception e) {
					System.err.println(e);
				}
				break;

			}
		}
		input.close();
		
	}

}
