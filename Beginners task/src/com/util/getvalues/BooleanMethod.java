package com.util.getvalues;

import java.util.Scanner;

public class BooleanMethod {
	boolean value;
	private Scanner input=new Scanner(System.in);

	public boolean isBoolean() {
		boolean loop=true;
		while(loop) {
			if(input.hasNextBoolean()) {
				value=input.nextBoolean();
				loop=false;
			}
			else {
				System.out.println("Enter only Boolean type.");
				input.next();
			}
		}
		input.close();
		return value;
	}
}
