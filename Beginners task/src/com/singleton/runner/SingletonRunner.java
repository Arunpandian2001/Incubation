package com.singleton.runner;

import com.singleton.method.Singleton;

public class SingletonRunner {
	
	public static void main(String[] args) {
		
		System.out.println(Singleton.INST.getValue());
		Singleton.INST.setValue(5);
		System.out.println(Singleton.INST.getValue());

	}
}
