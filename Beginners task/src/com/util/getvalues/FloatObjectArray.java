package com.util.getvalues;

import java.util.Scanner;

import util.getvalues.FloatMethod;

public class FloatObjectArray {

	FloatMethod floatInput=new FloatMethod();
	private Scanner input=new Scanner(System.in);

	public Float[] getFloatArray() {
		int size=0;
		System.out.println("Enter count of.float:");
		size=input.nextInt();
		System.out.println("Enter the numbers");
		Float[] floatArray=new Float[size];
		for(int i=0;i<size;i++) {
			floatArray[i]=floatInput.isFloat(input);
		}
		input.close();
		return floatArray;
	}
}
