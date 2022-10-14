package util.getvalues;

import java.util.Scanner;

public class StringArray {
	IntegerMethod getInt=new IntegerMethod();
	GetString inputString=new GetString();
	
	public String[] getStringArray(Scanner input) {
		System.out.println("Enter the number of entries");
		int size=getInt.isInteger(input);
		System.out.println("Enter the content");
		String[] array=new String[size];
		for(int i=0;i<size;i++) {
			array[i]=inputString.getString(input);
		}
		return array;
	}
}
