package com.string.runner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

import createdexception.CreatedException;
import com.string.method.StringMethods;
import com.util.getvalues.*;

public class StringRunner {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);	

		boolean value=true;
		
		StringMethods method=new StringMethods();
		IntegerMethod getIntInput=new IntegerMethod();
		GetString inputString=new GetString();
		StringLine inputLine=new StringLine();
		
	//	final Logger logger=new Logger("com.string.runner.StringRunner");

		while(value){
			
			System.out.println("1) Accept a String & find the length of a String");
			System.out.println("2) Accept a String & convert it into character Array");
			System.out.println("3) Accept a String & find the character from last ");
			System.out.println("4) accept a string & find the number of occurrences of a given letter/character");
			System.out.println("5) accept a String(with repeated letters) & find the greatest position of the given letter/character.");
			System.out.println("6) Print the last 'n' number of characters of a given String.");
			System.out.println("7) To print the first 'n' number of characters of a given String");
			System.out.println("8) Replace the first 'n' number of characters of a String with another provided string");//changes provided string length should be less than string
			System.out.println("9) Check whether a String starts with given string");
			System.out.println("10) Check whether a String ends with given String ");
			System.out.println("11) Convert an all lowercase string to an uppercase string.");
			System.out.println("12) Convert an all uppercase string to an lowercase string");
			System.out.println("13) To reverse a String.");
			System.out.println("14) Accept a line with multiple Strings");
			System.out.println("15) Accept a line with multiple Strings and concatenate each individual Strings and output a Single String without space. ");
			System.out.println("16) Accept a line with multiple Strings and concatenate each individual Strings and output a Single String without space.");
			System.out.println("17) Accept multiple Strings & merge each String with a character in between ");
			System.out.println("18) Check whether the two given input String are equal -case sensitive ");
			System.out.println("19) Check whether the two given input String are equal -case in sensitive");
			System.out.println("20) accept a String with a space at the end & beginning or both and output the proper String with no space either at the beginning or end.");
			System.out.println("21) Exit");
			
			System.out.println("Enter the option ::");
			int option=getIntInput.isInteger(scanner);
			switch(option){
			
				case 1:{
					if(args.length>0)
					{
						try{
							System.out.println("The length of the String is ::"+method.getStringLength(args[0]));
						
						}catch(CreatedException e){
							System.out.println(e);
						}
						System.out.println();
						value=false;
						break;
					}
					else{
						System.out.println("String is not entered \nReLaunch the program to run ");
						value=false;
						break;
					}	

				}
			
				case 2:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					System.out.println("Converted to Character Array ::");
						
					try{
						System.out.print(Arrays.toString(method.getCharArray(word)));
					}catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 3:
				{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					System.out.println("Enter the character position from last::");
					int index=getIntInput.isInteger(scanner);
					try{
						char found= method.getCharFromLast(word,index);//Special character
						System.out.println("Character at mentioned position ::"+found);				
					}catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				case 4:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					System.out.println("Enter the character ::");
					try{
						char character=scanner.next().charAt(0);
						System.out.println("Character Occurence of "+character+" in string ::"+method.getLetterOccurence(character,word));
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;		
				}
				
				case 5:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					System.out.println("Enter the character ::");
					try{
						char character=scanner.next().charAt(0);
						System.out.println("Greatest Occurence of"+character+" ::"+method.getGreatestLetterOccurence(character,word));
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;		
				}
				
				case 6:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					System.out.println("Enter how many number of last characters to be printed ::");
					int index=getIntInput.isInteger(scanner);
					try{
						System.out.println("Character at Last "+index+"place ::"+method.lastString(word,index));
					}
					//if index is greater than length error
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 7:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					System.out.println("Enter how many number of characters to be printed from beginning::");
					int index=getIntInput.isInteger(scanner);
					try{
						System.out.println("Character at First " +index +" place ::"+method.firstString(word,index));
					}catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 8:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					System.out.println("Enter the string to be replaced ::");
					String change=inputString.getString(scanner);
					System.out.println("Enter where the string has to be replaced \n  first ----> 1\n last ----> 2  ::");//check not working
					int choice=getIntInput.isInteger(scanner);
					try{
						System.out.println("The replaced string :: "+method.getReplaceChar(word,change,choice));
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 9:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					System.out.println("Enter the word to be checked ::");
					String check=inputString.getString(scanner);
					try{
						if(method.startString(word,check)){
							System.out.println("The given string"+check+"is present");
							System.out.println();
							break;	
						}
						System.out.println("The given string"+check+"is absent");
						
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;		
				}
				
				case 10:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					System.out.println("Enter the word to be checked ::");
					String check=inputString.getString(scanner);
					try{
						if(method.endString(word,check)){
							System.out.println("The given string"+check+"is present");
							System.out.println();
							break;	
						}
						System.out.println("The given string"+check+"is absent");
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 11:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					try{
						System.out.println("The converted string::"+method.lowerString(word));
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 12:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					try{
						System.out.println("The converted string::"+method.upperString(word));
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 13:{
					System.out.println("Enter the word ::");
					String word=inputString.getString(scanner);
					try{
						System.out.println("The reversed string is ::"+method.reverseString(word));
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 14:{
					System.out.println("Enter the words ::");
					scanner.nextLine();
					String word=inputLine.getMultipleString(scanner);
					try{
						System.out.println("The String received ::"+method.getPrintString(word));
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 15:{
					System.out.println("Enter the words ::");
					scanner.nextLine();
					String word= inputLine.getMultipleString(scanner);
					try{
						System.out.println("The Combined String ::"+method.getClearedWhiteSpace(word));
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 16:{
					System.out.println("Enter the words ::");
					scanner.nextLine();
					String word=inputLine.getMultipleString(scanner);	
					try{
						String [] words=method.getSplitToArr(word);
						System.out.println("The Combined String ::"+Arrays.toString(words));

					}catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;		
				}
				
				case 17:{
					System.out.println("Enter the number of words ::");
					int size =getIntInput.isInteger(scanner);
					//char currentSymbol=scanner.next().charAt(0);
					System.out.println("Enter the character to be inserted ::");
					String changeSymbol=inputString.getString(scanner);
					String[] words=new String[size];
					System.out.println("Enter the words ::");	
					try{		
						for(int i=0;i<size;i++){
							 words[i]=inputString.getString(scanner);
						}
						
						System.out.println("The Combined String ::"+ method.getJoinedString(words,changeSymbol));
					}	
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 18:{
					System.out.println("Enter the String 1:: ");
					scanner.nextLine();
					String word1=inputString.getString(scanner);
					System.out.println("Enter the String 2:: ");
					String word2=inputString.getString(scanner);
					try{
						if(method.compareString(word1,word2)){
							System.out.println("The strings "+word1+" and  "+word2 +" are equal");
							System.out.println();
							break;
						}
						System.out.println("The strings "+word1+" and  "+word2 +" are not equal");
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 19:{
					System.out.println("Enter the String 1:: ");
					scanner.nextLine();
					String word1=inputString.getString(scanner);
					System.out.println("Enter the String 2:: ");
					String word2=inputString.getString(scanner);
					try{
						if(method.getIgnoreCaseString(word1,word2)){
							System.out.println("The strings "+word1+" and  "+word2 +" are equal");
							System.out.println();
							break;
						}
						System.out.println("The strings "+word1+" and  "+word2 +" are not equal");
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;		
				}
				
				case 20:{
					System.out.println("Enter the Sentence");
					scanner.nextLine();
					String sentence=inputString.getString(scanner);
					try{
						System.out.println("The Trimmed Sentence :: "+method.getTrimmedString(sentence));
					}
					catch(CreatedException e){
						System.out.println(e);
					}
					System.out.println();
					break;	
				}
				
				case 21:{
					
					value=false;
					System.out.println("Have a good day");
					System.out.println();
					break;	
				}
				
				default :{
					System.out.println("Enter valid input");
					break;
				}
			}
		
		}
	}
	


}
