package com.thread.runner;

import java.util.Scanner;

import com.thread.method.ExtendedThread;
import com.thread.method.RunnableThread;
import com.util.getvalues.*;
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
					ExtendedThread ex=new ExtendedThread(name);
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
					/*System.out.println("Enter the name for thread ::");
					String name=stringInput.getString(input);*/
					RunnableThread run=new RunnableThread();
					Thread t1=new Thread(run);
					System.out.println("Before thread");
					System.out.println(run.getThreadName());
					//System.out.println(t1.getName());
					System.out.println(run.getGetThreadPriority());
					System.out.println(run.getGetThreadState());
					System.out.println("\n\n");
					//RunnableThread run1=new RunnableThread(name);
					t1.start();
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
			}
			
			
			case 3:{
				try {
					ExtendedThread ex=new ExtendedThread("ExtendedThread");

					System.out.println("Before Extended thread");
					System.out.println(ex.getName());
					System.out.println(ex.getPriority());
					System.out.println(ex.getState());
					System.out.println("\n\n");
					
					ex.start();
					ex.join();
					
					System.out.println("\n\n");
					RunnableThread run=new RunnableThread();
					System.out.println("Before Runnable thread");
					System.out.println(run.getThreadName());
					System.out.println(run.getGetThreadPriority());
					System.out.println(run.getGetThreadState());
					System.out.println("\n\n");
					RunnableThread run1=new RunnableThread("RunnableThread");
					Thread t1=new Thread(run1);
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
					
					System.out.println("Enter the number of Extended threats to be created ::");
					ExtendedThread[] extendedArray=new ExtendedThread[(getInt.isInteger(input))];
					
					System.out.println("Enter the number of Runnable threats to be created ::");
					RunnableThread[] runnableArray=new RunnableThread[(getInt.isInteger(input))];
					
					System.out.println("Enter the time to sleep for Extended Thread::");
					long extendTime=getLong.isLong(input);
					
					
					System.out.println("Enter the time to sleep for Runnable Thread::");
					long runTime=getLong.isLong(input);
					
					
					int extNamesNum=extNames.length;
					int runNamesNum=runNames.length;
					int extendedArrayNum=extendedArray.length;
					int runnableArrayNum=runnableArray.length;
				
					if(extendedArrayNum!=runnableArrayNum || extNamesNum != runNamesNum || extNamesNum!= runnableArrayNum) {
						throw new Exception ("The no of inputs entered is unequal");
					}
					
					for (int i = 0; i < extendedArrayNum; i++) {
						ExtendedThread thread =new ExtendedThread(extNames[i]);
						thread.setSleepDuration(extendTime);
						extendedArray[i]=thread;
						thread.start();
					}
					
					
					for (int j = 0; j < runnableArrayNum; j++) {
						RunnableThread run =new RunnableThread(runNames[j]);
						run.setSleepDuration(runTime);
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
					
					System.out.println("Enter the number of Extended threats to be created ::");
					ExtendedThread[] extendedArray=new ExtendedThread[(getInt.isInteger(input))];
					
					System.out.println("Enter the number of Runnable threats to be created ::");
					RunnableThread[] runnableArray=new RunnableThread[(getInt.isInteger(input))];
					
					int extNamesNum=extNames.length;
					int runNamesNum=runNames.length;
					int extendedArrayNum=extendedArray.length;
					int runnableArrayNum=runnableArray.length;
				
					if(extendedArrayNum!=runnableArrayNum || extNamesNum != runNamesNum || extNamesNum!= runnableArrayNum) {
						throw new Exception ("The no of inputs entered is unequal");
					}
					
					for (int i = 0; i < extendedArrayNum; i++) {
						System.out.println("Enter the time to sleep for Extended Thread::");
						long extendTime=getLong.isLong(input);
						ExtendedThread thread =new ExtendedThread(extNames[i]);
						thread.setSleepDuration(extendTime);
						extendedArray[i]=thread;
						thread.start();
					}
					
					
					for (int j = 0; j < runnableArrayNum; j++) {
						System.out.println("Enter the time to sleep for Runnable Thread::");
						long runTime=getLong.isLong(input);
						RunnableThread run =new RunnableThread(runNames[j]);
						run.setSleepDuration(runTime);
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
					ExtendedThread[] extendedArray=new ExtendedThread[(getInt.isInteger(input))];
					
					System.out.println("Enter the number of Runnable threats to be created ::");
					RunnableThread[] runnableArray=new RunnableThread[(getInt.isInteger(input))];
					
					int extNamesNum=extNames.length;
					int runNamesNum=runNames.length;
					int extendedArrayNum=extendedArray.length;
					int runnableArrayNum=runnableArray.length;
				
					if(extendedArrayNum!=runnableArrayNum || extNamesNum != runNamesNum || extNamesNum!= runnableArrayNum) {
						throw new Exception ("The no of inputs entered is unequal");
					}
					
					for (int i = 0; i < extendedArrayNum; i++) {
						System.out.println("Enter the time to sleep for Extended Thread::");
						long extendTime=getLong.isLong(input);
						ExtendedThread thread =new ExtendedThread(extNames[i]);
						thread.setSleepDuration(extendTime);
						extendedArray[i]=thread;
						System.out.println("Enter the boolean value for extended thread ::");
						boolean extValue=input.nextBoolean();
						thread.setValue(extValue);
						thread.start();
						
					}
					
					
					for (int j = 0; j < runnableArrayNum; j++) {
						System.out.println("Enter the time to sleep for Runnable Thread::");
						long runTime=getLong.isLong(input);
						RunnableThread run =new RunnableThread(runNames[j]);
						run.setSleepDuration(runTime);
						runnableArray[j]=run;
						Thread t=new Thread(run);
						System.out.println("Enter the boolean value for extended thread ::");
						boolean runValue=input.nextBoolean();
						run.setValue(runValue);
						t.start();

					}
					
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
					

			}
			
			case 7:{
				try {
					System.out.println("Names of Extended Class");
					String extNames[]=stringArrInput.getStringArray(input);

					System.out.println("Names of Runnable Class");
					String runNames[]=stringArrInput.getStringArray(input);
					
					ExtendedThread[] extendedArray=new ExtendedThread[extNames.length];
					
					System.out.println("Enter the number of Runnable threats to be created ::");
					RunnableThread[] runnableArray=new RunnableThread[runNames.length];
					
					int extNamesNum=extNames.length;
					int runNamesNum=runNames.length;
					int extendedArrayNum=extendedArray.length;
					int runnableArrayNum=runnableArray.length;
				
					if(extendedArrayNum!=runnableArrayNum || extNamesNum != runNamesNum || extNamesNum!= runnableArrayNum) {
						throw new Exception ("The no of inputs entered is unequal");
					}
					
					for (int i = 0; i < extendedArrayNum; i++) {
						System.out.println("Enter the time to sleep for Extended Thread::");
						long extendTime=getLong.isLong(input);
						ExtendedThread thread =new ExtendedThread(extNames[i]);
						thread.setSleepDuration(extendTime);
						extendedArray[i]=thread;
						System.out.println("Enter the boolean value for extended thread ::");
						boolean extValue=input.nextBoolean();
						thread.setValue(extValue);
						thread.start();
						
					}
					
					
					for (int j = 0; j < runnableArrayNum; j++) {
						System.out.println("Enter the time to sleep for Runnable Thread::");
						long runTime=getLong.isLong(input);
						RunnableThread run =new RunnableThread(runNames[j]);
						run.setSleepDuration(runTime);
						runnableArray[j]=run;
						Thread t=new Thread(run);
						System.out.println("Enter the boolean value for extended thread ::");
						boolean runValue=input.nextBoolean();
						run.setValue(runValue);
						t.start();

					}
					
					System.out.println("Tasks completed");
				}catch(Exception e) {
					System.out.println(e);
				}
				break;

			}
		}
		input.close();
		
	}

}
