package com.file.runner;
import java.util.Scanner;
import com.file.methods.POJOMethod;

public class POJORunner2 {

	public static void main(String[] args) {
		POJOMethod method=new POJOMethod("",0);
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the integer::");
		int num=input.nextInt();
		method.setNum(num);
		System.out.println("Enter the String::");
		String str=input.next();
		method.setStr(str);
		System.out.println("Integer is ::"+method.getNum());
		System.out.println("String is::"+method.getStr());
		input.close();
	}

}
