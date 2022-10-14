package util.getvalues;

import java.util.Scanner;

public class LongMethod {
	public long isLong(Scanner input) {
		boolean loop=true;
		long number=0;
		while(loop) {
			if(input.hasNextLong()) {
				number=input.nextLong();
				loop=false;
			}
			else {
				System.out.println("Enter only Long type.");
				input.next();
			}
		}
			
		return number;
	}
}
