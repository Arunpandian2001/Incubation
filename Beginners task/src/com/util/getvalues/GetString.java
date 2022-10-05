package com.util.getvalues;

import java.util.Scanner;

public class GetString {
	public String getString(Scanner scanner) {
		scanner.nextLine();
		String name=scanner.next();
		return name;
	}
}
