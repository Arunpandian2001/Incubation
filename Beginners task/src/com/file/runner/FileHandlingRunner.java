package com.file.runner;

import java.io.File;
import java.util.Properties;
import java.util.Scanner;

import com.file.methods.CreateOutputStreamFile;
import com.file.methods.MakeAndSetProperties;
import com.file.methods.MakeDirectory;
import com.file.methods.ReadProperties;
import com.util.getvalues.IntegerMethod;
import com.util.getvalues.StringArray;

public class FileHandlingRunner {
	

	public static void main(String[] args) {
		CreateOutputStreamFile make=new CreateOutputStreamFile();
		MakeAndSetProperties designProp=new MakeAndSetProperties();
		IntegerMethod getInteger=new IntegerMethod();
		Scanner input=new Scanner(System.in);
		StringArray stringArr=new StringArray();
		ReadProperties read=new ReadProperties();
		MakeDirectory mkdir=new MakeDirectory();
		System.out.println("Enter the choice");
		int choice=getInteger.isInteger(input);
		switch(choice) {
			case 1:{
				try {
					make.writeNewFile(input);

				}catch(Exception e) {
					System.out.println(e);
				}
				break;
			}
			
			case 2:{
					String key[]=stringArr.getStringArray(input);
					String[] value=stringArr.getStringArray(input);
				
					designProp.makeProp(input,key,value);
					break;
				}
			
			case 3:{
				String key[]=stringArr.getStringArray(input);
				String[] value=stringArr.getStringArray(input);
			
				Properties prop=designProp.makeProp(input,key,value);
				read.readProperties(prop);
				break;
			
			}
			
			case 4:{
				
				try {
					mkdir.makeDirectory(input);
					
					break;
				}catch(Exception e){
					System.out.println(e);
				}
				break;
			}
			
			case 5:{
				try {
					
				}catch(Exception e) {
					
				}
				break;
			}
			
			
		}
	
	}
}
