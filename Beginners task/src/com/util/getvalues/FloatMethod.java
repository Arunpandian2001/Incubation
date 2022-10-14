package com.util.getvalues;

import java.util.Scanner;

public class FloatMethod {
	private Scanner input=new Scanner(System.in);
	public float isFloat() {
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
		input.close();
		return number;
	}
}
 