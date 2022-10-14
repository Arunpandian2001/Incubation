package com.file.runner;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import com.file.methods.FileHandlingMethod;

import createdexception.CreatedException;
import util.getvalues.GetString;
import util.getvalues.IntegerMethod;
import util.getvalues.StringArray;

public class FileHandlingRunner {
	
	
	public static void main(String[] args) {
		
		IntegerMethod getInteger=new IntegerMethod();
		Scanner input=new Scanner(System.in);
		StringArray stringArr=new StringArray();
		
		System.out.println("Enter the choice");
		GetString stringInput=new GetString();
		FileHandlingMethod method=new FileHandlingMethod();
		FileHandlingRunner runner=new FileHandlingRunner();
		int choice=getInteger.isInteger(input);
		
		switch(choice) {
		
			case 1:{
				
				System.out.println("Enter the name of the file with extension");
				String fileName=stringInput.getString(input);
				
				System.out.println("Enter the contents to be entered in the file");
				String[] contents=stringArr.getStringArray(input);

				try {
					method.writeNewFile(fileName,contents);

				}catch(IOException e) {
					System.out.println(e);
				} catch (CreatedException e) {
					System.out.println(e);
				}
				break;
			}
			
			case 2:{
					System.out.println("Enter the name of the file with extension");
					String fileName=stringInput.getString(input);
					Properties prop=new Properties();

					System.out.println("Enter the keys");
					String key[]=stringArr.getStringArray(input);
					System.out.println("Enter the values");
					String[] value=stringArr.getStringArray(input);
				
					for(int i=0;i<key.length;i++) {
						prop=method.makeProp(value[i],key[i],prop);
					}
					try {
						method.writeProp(fileName,prop);
					}catch(IOException e) {
						System.out.println(e);
					}
					break;
				}
			
			case 3:{
				System.out.println("Enter the file name");
				String fileName=stringInput.getString(input);
				Properties prop=new Properties();

				try {
					prop=method.readProperties(fileName,prop);
					System.out.println(prop);
					method.writeProp(fileName,prop);

				}catch(IOException e) {
					System.out.println(e);
				}
				break;
			
			}
			
			case 4:{
				
				Properties prop=new Properties();
				
				System.out.println("Enter the location where the file should be stored");
				String location=stringInput.getString(input);
				
				System.out.println("Enter the name of the file with extension");
				String fileName1=stringInput.getString(input);
				
				
				System.out.println("Enter the contents to be entered in the file");
				String[] contents=stringArr.getStringArray(input);

				
				System.out.println("Enter the name of the property file with extension");
				String fileName2=stringInput.getString(input);
				
				System.out.println("Enter the key to enter in property class");
				String key[]=stringArr.getStringArray(input);
				
				System.out.println("Enter the value to enter in property class");
				String[] value=stringArr.getStringArray(input);
				
					if(method.makeDirectory(location)) {
						System.out.println("The directory is created");
					}
					else {
						System.out.println("The directory already exists");
					}
					fileName1=location+"/"+fileName1;
					fileName2=location+"/"+fileName2;

					for(int i=0;i<key.length;i++) {
						prop=method.makeProp(value[i],key[i],prop);
					}
					try {
						method.writeNewFile(fileName1,contents);
						method.writeProp(fileName2,prop);
						prop=method.readProperties(fileName2,prop);
						System.out.println(prop);
						method.writeProp(fileName2,prop);
					}catch(IOException | CreatedException e) {
						System.out.println(e);
					}
				break;
			}
			
			default:{
				System.out.println("Enter valid input");
				break;
			}
			
			
		}
	
	}
}
