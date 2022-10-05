package com.util.getvalues;

import java.util.Scanner;

public class IntArray {
	
	public int[] getIntArray(Scanner input) {
		IntegerMethod getInt=new IntegerMethod();
		System.out.println("Enter the number of integer::");
		int size=getInt.isInteger(input);
		int[] intArray=new int[size];
		System.out.println("Enter the elements of array::");
		for(int i=0;i<size;i++) {
			intArray[i]=getInt.isInteger(input);
		}
		return intArray;
	}
}
