package com.util.getvalues;

import java.util.Scanner;

public class MultipleStringArray {
	
	IntegerMethod getInt=new IntegerMethod();
	StringLine inputStringLine=new StringLine();
	
	public String[] getStringArray(Scanner input) {
		
		System.out.println("Enter the num.of.words::");
		int size=getInt.isInteger(input);
		System.out.println("Enter the words");
		input.nextLine();
		String[] array=new String[size];
		for(int i=0;i<size;i++) {
			array[i]=inputStringLine.getMultipleString(input);
		}
		return array;
	}
}
