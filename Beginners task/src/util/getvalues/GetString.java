package util.getvalues;

import java.util.Scanner;

public class GetString {
	public String getString(Scanner scanner) {
		String name=scanner.next();
		scanner.nextLine();

		return name;
	}
}
