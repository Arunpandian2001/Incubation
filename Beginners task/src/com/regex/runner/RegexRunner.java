package com.regex.runner;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.arraylist.methods.ArrayListMethod2;
import com.hashmap.methods.HashMapMethods;
import com.regex.method.RegexMethod;
import com.util.getvalues.GetString;
import com.util.getvalues.IntegerMethod;
import com.util.getvalues.StringArray;
import com.util.getvalues.StringLine;

import createdexception.CreatedException;

public class RegexRunner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in) ;
		IntegerMethod getInt=new IntegerMethod();
		GetString inputString=new GetString();
		RegexMethod method=new RegexMethod();
		ArrayListMethod2 listMethod=new ArrayListMethod2();
		HashMapMethods mapMethod=new HashMapMethods();
		StringArray stringArr=new StringArray();
		StringLine multipleString=new StringLine();
		boolean value=true;
		
		while(value) {
			System.out.println("Enter the choice");
			int choice=getInt.isInteger(input);

			switch(choice) {
			
				case 1:{
					System.out.println("Enter the mobile number");
					String mobileNumber=inputString.getString(input);

					try {
						if(method.isMobileNumber(mobileNumber)) {
							System.out.println("The given mobile number matches the pattern");
						}
						else {
							System.out.println("The given mobile number does not match the pattern ");
						}
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println("\n\n\n");
					break;
				}
				
				case 2:{
					System.out.println("Enter the string ");
					String alphaNumeric=inputString.getString(input);
					try {
						if(method.isAlphaNumeric(alphaNumeric)) {
							System.out.println("The pattern matches the given string");
						}
						else {
							System.out.println("The pattern does not match the given string");
						}
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println("\n\n\n");
					break;
				}
				
				case 3:{
					System.out.println("Enter the String");
					String matcherString=inputString.getString(input);
					System.out.println("Enter the string to compare given cases ");
					final String REGEX=inputString.getString(input);
					System.out.println("\n\n");
					
					try {
						if(method.isStartString(REGEX,matcherString)) {
							System.out.println("The stirng "+matcherString+" starts with "+REGEX+"\n");
						}
						else {
							System.out.println("The stirng "+matcherString+"doesnot start with "+REGEX+"\n");
						}
						
						if(method.isContainsString(REGEX,matcherString)) {
							System.out.println("The string "+matcherString+" contains  "+REGEX+"\n");
						}
						else {
							System.out.println("The stirng "+matcherString+"doesnot contain with "+REGEX+"\n");
						}
						
						if(method.isEndsString(REGEX,matcherString)) {
							System.out.println("The stirng "+matcherString+" ends with "+REGEX+"\n");
						}
						else {
							System.out.println("The stirng "+matcherString+" doesnot end with "+REGEX+"\n");
						}
						
						if(method.isMatchingsString(REGEX,matcherString)) {
							System.out.println("The string "+matcherString+" matches with "+REGEX+"\n");
						}
						else {
							System.out.println("The string "+matcherString+" doesnot match with "+REGEX+"\n");
						}
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					
					System.out.println("\n\n\n");
					break;
				}
				
				case 4:{
					List<String> list=listMethod.getArrayList("");
					System.out.println("Enter the details for string array");
					String[] matcherStrings=stringArr.getStringArray(input);
					System.out.println("Enter the string to compare given cases ");
					final String REGEX=inputString.getString(input);
					System.out.println("\n\n");
					
					try {
						for(String matcherString : matcherStrings) {
							if(method.isMatchingIgnoringCases(list,REGEX,matcherString)) {
								System.out.println("The string "+matcherString+" matches with "+REGEX+"\n");
							}
							else {
								System.out.println("The string "+matcherString+" doesnot match with "+REGEX+"\n");
							}
						}
					}catch(CreatedException e) {
						System.out.println(e);
					}
					
					System.out.println("\n\n\n");
					break;
				}
				
				case 5:{
					
					System.out.println("Enter the mail id");
					String matcherString=inputString.getString(input);
					
					//At first the string is restricted that it should not be started with period symbol and then n numbers of characters can be repeated and @ symbol
					//should be followed then it can be followed by another n number of characters and it cant be ended with period symbol or @ symbol
					
					try {
						if(method.isEmailValid(matcherString)) {
							System.out.println("The email id "+matcherString+" passes the coindition");
						}
						else {
							System.out.println("The email id "+matcherString+" doesnot pass the coindition");
						}
					}catch(CreatedException e) {
						System.out.println(e);
					}
					
					System.out.println("\n\n\n");
					break;
				}
				
				case 6:{
					
					List<String> list=listMethod.getArrayList("");
					System.out.println("Enter the details for string array");
					String[] matcherStrings=stringArr.getStringArray(input);
					System.out.println("\n\n");
					
					try {
						for(String matcherString : matcherStrings) {
							if(method.isLengthValid(list,matcherString)) {
								System.out.println("The string "+matcherString+" matches with the given length\n");
							}
							else {
								System.out.println("The string "+matcherString+" doesnot match with the given length \n");
							}
						}
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println("\n\n\n");
					break;
				
				}
				
				case 7:{
					List<String> list1=listMethod.getArrayList("");
					List<String> list2=listMethod.getArrayList("");
					HashMap<String,Integer> map=mapMethod.getHashMap("",1);
					
					
					input.nextLine();
					System.out.println("Enter the details for List 1");
					String [] stringArray1=stringArr.getStringArray(input);
					input.nextLine();
					System.out.println("Enter the details for List 2");
					String [] stringArray2=stringArr.getStringArray(input);
					
					try {
						list1=listMethod.getStringAddedList(list1, stringArray1);
						list2=listMethod.getStringAddedList(list2, stringArray2);

						map=method.getCommonStringMap(list1,list2,map);
						
						System.out.println(map);
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println("\n\n");
					break;
				}
				
				case 8:{
					System.out.println("Enter the html tag");
					input.nextLine();
					String htmlString=multipleString.getMultipleString(input);
					List<String> tagList=listMethod.getArrayList("");
					
					try {
						tagList=method.getHTMLTags(htmlString,tagList);
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println("The list is "+tagList);
					System.out.println("\n\n");
					break;
				}
				
				case 9:{
					value=false;
					System.out.println("The program is exited");
					System.out.println("\n\n\n");
					break;
				}
				
				default:{
					System.out.println("Enter proper value");
					System.out.println("\n\n\n");
					break;
				}
			}
		}
		input.close();
	}

}
