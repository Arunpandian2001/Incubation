package com.util.getvalues;

import java.util.Scanner;

public class FloatMethod {
	public float isFloat(Scanner input) {
		boolean loop=true;
		float number=0;
		while(loop) {
			if(input.hasNextFloat()) {
				number=input.nextFloat();
				loop=false;
			}
			else {
				System.out.println("Enter only Float type.");
				input.next();
			}
		}
			
		return number;
	}
}
