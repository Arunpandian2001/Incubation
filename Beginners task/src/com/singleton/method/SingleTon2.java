package com.singleton.method;

public class SingleTon2 {

	public static final SingleTon2 single=new SingleTon2();
	
	private SingleTon2() {}
	
	public static SingleTon2 getInstance() {
		return single;
	}
}