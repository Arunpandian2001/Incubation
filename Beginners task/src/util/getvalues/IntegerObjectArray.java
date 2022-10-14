package util.getvalues;

import java.util.Scanner;

public class IntegerObjectArray {
	
	public Integer[] getIntArray(Scanner input) {
		IntegerMethod getInt=new IntegerMethod();
		int size=0;
		System.out.println("Enter no.of.integer:");
		size=input.nextInt();
		System.out.println("Enter the numbers");
		Integer[] integerArray=new Integer[size];
		for(int i=0;i<size;i++) {
			integerArray[i]=getInt.isInteger(input);
		}
		return integerArray;
	}
}
