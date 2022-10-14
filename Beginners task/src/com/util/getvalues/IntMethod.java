package com.util.getvalues;

import java.util.Scanner;

public class IntMethod {
	
	private Scanner input=new Scanner(System.in);
	
	public int isInteger() {
		boolean loop=true;
		int number=0;
		while(loop) {
			if(input.hasNextInt()) {
				number=input.nextInt();
				loop=false;
			}
			else {
				System.out.println("Enter only Integer type.");
				input.next();
			}
		}
		input.close();
		return number;
	}

}
