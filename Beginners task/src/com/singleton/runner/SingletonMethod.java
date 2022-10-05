package com.singleton.runner;
 
public class SingletonMethod {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Singleton.INST.getValue());
		Singleton.INST.setValue(5);
		System.out.println(Singleton.INST.getValue());

	}
}
