package com.file.runner;

import java.util.Scanner;

import com.file.methods.POJOMethod;

public class POJORunner {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		POJOMethod pojo=new POJOMethod("",1);
		System.out.println("Integer::");
		int num=input.nextInt();
		pojo.setNum(num);
		System.out.println("String");
		String str=input.next();
		pojo.setStr(str);
		System.out.println(pojo);
		input.close();
	}

}
