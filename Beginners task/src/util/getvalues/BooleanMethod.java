package util.getvalues;

import java.util.Scanner;

public class BooleanMethod {
	boolean value;

	public boolean isBoolean(Scanner input) {
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
		return value;
	}
}
