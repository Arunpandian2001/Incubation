package com.util.getvalues;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BooleanMethod {
	boolean value;

	public boolean isBoolean(Scanner input) throws InputMismatchException{
	
			
				if(input.hasNextBoolean()) {
					value=input.nextBoolean();
				}
		
		return value;
	}
}
