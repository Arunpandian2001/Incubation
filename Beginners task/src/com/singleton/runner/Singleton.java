package com.singleton.runner;

public enum Singleton {


	 INST,INSTA;
	
	private Singleton() {
		
	}
	public int value;
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	
}
