package com.singleton.method;

public class Singleton3 {
	
	public static Singleton3 single;
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		if(single==null) {
			synchronized (single) {
					if(single==null) {
					single=new Singleton3();
				}
			}
		}
		return single;
	}
	
}
