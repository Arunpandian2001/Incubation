package com.file.methods;

public class POJOReflectionMethod {

	String str;
	int num=0;
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getNum() {
		//System.out.println("get");
		return num;
	}

	public void setNum(int num) {
		this.num = num;
		//System.out.println(num);
	}

	public POJOReflectionMethod() {}
	
	public POJOReflectionMethod(String str,int num) {
		this.str=str;
		this.num=num;
	}
}
