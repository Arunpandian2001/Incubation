package util.getvalues;

import java.util.Scanner;

public class LongObjectArray {
	LongMethod inputLong=new LongMethod();
	public Long[] getLongArray(Scanner input) {
		int size=0;
		System.out.println("Enter no.of.elements:");
		size=input.nextInt();
		System.out.println("Enter the numbers");
		Long[] longArray=new Long[size];
		for(int i=0;i<size;i++) {
			longArray[i]=inputLong.isLong(input);
		}
		return longArray;
	}
	
}
