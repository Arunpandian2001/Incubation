package com.util.getvalues;

import java.util.Scanner;

public class GetString {
	private Scanner scanner =new Scanner(System.in);
	public String getString() {
		String name=scanner.next();
		scanner.nextLine();
		scanner.close();
		return name;
	}
}
