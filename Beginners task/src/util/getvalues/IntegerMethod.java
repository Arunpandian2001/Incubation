package util.getvalues;
import java.util.Scanner;


public class IntegerMethod {
	
	public int isInteger(Scanner input) {
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
		return number;
	}
}
