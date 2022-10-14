package com.stringbuilder.runner;
import java.util.Scanner;

import com.stringbuilder.method.BuilderMethod;

import createdexception.CreatedException;
import util.getvalues.*;

public class BuilderRunner {
	
	public static void main(String[] args) throws CreatedException{
		Scanner scanner = new Scanner(System.in);
		BuilderRunner tester = new BuilderRunner();
		BuilderMethod method = new BuilderMethod();
		IntegerMethod getIntInput=new IntegerMethod();
		GetString inputString=new GetString();
		StringLine inputLine=new StringLine();
		StringArray inputArray=new StringArray();

		boolean value = true;
		while (value) {
			System.out.print("Enter the choice:: ");
			int option = getIntInput.isInteger(scanner);
			switch (option) {

				case 1: {
					StringBuilder builder=method.getStringBuilder();
					scanner.nextLine();
					System.out.print("Enter the String to add ::");
					String sentence = inputLine.getMultipleString(scanner);
					try {
						System.out.println("String Builder Length before alteration::" + method.getLength(builder));
						builder = method.addStringBuilder(builder, sentence);
						System.out.println("String Builder length after alteration::" + method.getLength(builder));
						System.out.println("The String present is :: " + builder);
						System.out.println();
					} catch (CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					System.out.println();
					break;
	
				}
				
				case 2:{
					StringBuilder builder=method.getStringBuilder();
					System.out.println("Enter the String ::");
					scanner.nextLine();
					String sentence=inputLine.getMultipleString(scanner);
					System.out.println("Enter the character to be inserted::");
					String insert=inputString.getString(scanner);
					
					try {
						builder=method.addStringBuilder(builder, sentence);
						System.out.println("String Builder Length ::" + method.getLength(builder));
						String[] names=inputArray.getStringArray(scanner);
						builder=method.getCombinedStringBuilder(builder,insert,names);
						System.out.println("The String present is :: " + builder);
						System.out.println("String Builder Length ::" + method.getLength(builder));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					System.out.println();
					break;
				}
				
				case 3:{
					StringBuilder builder=method.getStringBuilder();
					System.out.println("Enter the String 1::");
					String word1=inputString.getString(scanner);
					System.out.println("Enter the String 2::");
					String word2=inputString.getString(scanner);
					String replaceCharacter= " ";
					System.out.println("Enter string to be inserted:: ");
					String insert=inputString.getString(scanner);
					try {
						insert=method.concatString(insert);
						builder=method.getCombinedStringBuilder(builder,replaceCharacter, word1,word2);
						System.out.println("String Builder length:: "+method.getLength(builder));
						builder=method.getStringInserted(builder,replaceCharacter,insert);
						System.out.println(builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 4:{
					StringBuilder builder=method.getStringBuilder();
					System.out.println("Enter the String 1::");
					String word1=inputString.getString(scanner);
					System.out.println("Enter the String 2::");
					String word2=inputString.getString(scanner);
					System.out.println("For entering space press 1 for other characters press 2");
					int choice=getIntInput.isInteger(scanner);
					String replaceCharacter="";
					if(choice==1) {
						 replaceCharacter=" ";
					}
					else {
						 replaceCharacter=inputString.getString(scanner);
					}
					try {
						builder=method.appendSpace(builder,replaceCharacter);
						builder=method.getCombinedStringBuilder(builder,replaceCharacter, word1,word2);
						System.out.println(builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						System.out.println("Enter the string to be deleted ::");
						String toDelete=inputString.getString(scanner);
						builder=method.toDeleteString(builder,toDelete);
						System.out.println(builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 5:{
					StringBuilder builder=method.getStringBuilder();
					String [] words=inputArray.getStringArray(scanner);	
					String presentCharacter="";
					System.out.println("For entering space press 1 for other characters press 2");
					int choice=getIntInput.isInteger(scanner);
					if(choice==1) {
						presentCharacter=" ";
					}
					else {
						presentCharacter=inputString.getString(scanner);
					}
					try {
						builder=method.getCombinedStringBuilder(builder,presentCharacter,words);
						System.out.println("The String Builder present ::"+builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						System.out.println("Enter the character to be replaced in "+"\" "
								+presentCharacter+ "\"::");
						String replaceCharacter=inputString.getString(scanner);
						//replaceCharacter=method.concatString(replaceCharacter);
						builder=method.getCharInserted(builder,presentCharacter,replaceCharacter);
						System.out.println(builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 6:{
					StringBuilder builder=method.getStringBuilder();
					String [] words=inputArray.getStringArray(scanner);	
					System.out.println("For entering space press 1 for other characters press 2");
					int choice=getIntInput.isInteger(scanner);
					String replaceCharacter="";
					if(choice==1) {
						 replaceCharacter=" ";
					}
					else {
						 replaceCharacter=inputString.getString(scanner);
					}
					try {
						builder=method.appendSpace(builder,replaceCharacter);
						builder=method.getCombinedStringBuilder(builder,replaceCharacter,words);
						System.out.println("The String Builder present ::"+builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						builder=method.getReverseStringBuilder(builder);
						System.out.println("The String Builder present ::"+builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						System.out.println("");
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 7:{
					StringBuilder builder=method.getStringBuilder();
					System.out.println("Enter the minimum no.of character should be present in the String Builder::");
					int limit=getIntInput.isInteger(scanner);
					System.out.println("Enter the String::");
					scanner.nextLine();
					String word=inputLine.getMultipleString(scanner);
					try {
						builder=method.addStringBuilder(builder, word);
						builder.ensureCapacity(limit);
						System.out.println("The String Builder present ::"+builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						System.out.println("Enetr the starting index to remove the characters::");
						int startIndex=getIntInput.isInteger(scanner);
						System.out.println("Enter the endng index to remove the characters::");
						int endIndex=getIntInput.isInteger(scanner);
						method.compareIndex(startIndex,endIndex);
						builder=method.toDeleteAtIndex(builder,startIndex,endIndex);
						System.out.println("The String Builder present ::"+builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
					
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 8:{
					StringBuilder builder=method.getStringBuilder();
					System.out.println("Enter the minimum no.of character should be present in the String Builder::");
					int limit=getIntInput.isInteger(scanner);
					System.out.println("Enter the String::");
					scanner.nextLine();
					String word=inputLine.getMultipleString(scanner);
					try {
						builder=method.addStringBuilder(builder, word);
						builder.ensureCapacity(limit);
						System.out.println("The String Builder present ::"+builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						System.out.println("Enetr the starting index to remove the characters::");
						int startIndex=getIntInput.isInteger(scanner);
						System.out.println("Enter the endng index to remove the characters::");
						int endIndex=getIntInput.isInteger(scanner);
						method.compareIndex(startIndex,endIndex);
						System.out.println("Enter the stirng to be replaced ::");
						scanner.nextLine();
						String replaceString=inputLine.getMultipleString(scanner);
						builder=method.getReplacedString(builder,replaceString,startIndex,endIndex);
						System.out.println("The String Builder present ::"+builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 9:{
					StringBuilder builder=method.getStringBuilder();
					String [] words=inputArray.getStringArray(scanner);	
					System.out.println("For entering space press 1 for other characters press 2");
					int choice=getIntInput.isInteger(scanner);
					String replaceCharacter="";
					if(choice==1) {
						 replaceCharacter=" ";
					}
					else {
						 replaceCharacter=inputString.getString(scanner);
					}
					try {
						builder=method.appendSpace(builder,replaceCharacter);
						builder=method.getCombinedStringBuilder(builder,replaceCharacter,words);
						System.out.println(builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						System.out.println("Enter the character to find the index ::");
						String indexSymbol=inputString.getString(scanner);
						System.out.println("The first occurence of the provided symbol is ::"+method.toFindFirstIndex(builder, indexSymbol));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 10:{
					StringBuilder builder=method.getStringBuilder();
					String [] words=inputArray.getStringArray(scanner);	
					System.out.println("For entering space press 1 for other characters press 2");
					int choice=getIntInput.isInteger(scanner);
					String replaceCharacter="";
					if(choice==1) {
						 replaceCharacter=" ";
					}
					else {
						 replaceCharacter=inputString.getString(scanner);
					}try {
						builder=method.appendSpace(builder,replaceCharacter);
						builder=method.getCombinedStringBuilder(builder,replaceCharacter,words);
						System.out.println(builder);
						System.out.println("String Builder length:: "+method.getLength(builder));
						System.out.println("Enter the character to find the index ::");
						String indexSymbol=inputString.getString(scanner);
						System.out.println("The last occurence of the provided symbol is ::"+method.toFindLastIndex(builder, indexSymbol));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 11: {
					value = false;
					System.out.println("Have a good day");
					break;
				}
				
				default:
					System.out.println("Enter valid input");
					break;
			}
		}
		scanner.close();
	}


}
