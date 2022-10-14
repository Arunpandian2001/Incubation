package util.getvalues;

import java.util.Scanner;

public class FloatObjectArray {
	FloatMethod floatInput=new FloatMethod();
	
	public Float[] getFloatArray(Scanner input) {
		int size=0;
		System.out.println("Enter no.of.float:");
		size=input.nextInt();
		System.out.println("Enter the numbers");
		Float[] floatArray=new Float[size];
		for(int i=0;i<size;i++) {
			floatArray[i]=floatInput.isFloat(input);
		}
		return floatArray;
	}
}
