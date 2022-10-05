package com.util.getvalues;

import java.util.Scanner;

public class StringArray {
	IntegerMethod getInt=new IntegerMethod();
	GetString inputString=new GetString();
	
	public String[] getStringArray(Scanner input) {
		System.out.println("Enter the num.of.words::");
		int size=getInt.isInteger(input);
		System.out.println("Enter the words");
		String[] array=new String[size];
		for(int i=0;i<size;i++) {
			array[i]=inputString.getString(input);
		}
		return array;
	}
}
