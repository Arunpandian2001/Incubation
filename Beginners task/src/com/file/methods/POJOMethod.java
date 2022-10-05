package com.file.methods;

public class POJOMethod {
	
	public String str;
	public int num;

	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public POJOMethod(String str,int num) {
		this.num=num;
		this.str=str;
	}
	
	public String toString() {
		return str+"  "+num;
	}
	
	
}
