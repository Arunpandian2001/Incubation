package com.arraylist.runner;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.arraylist.methods.ArrayListMethod2;
import com.util.getvalues.*;

import createdexception.CreatedException;

public class ArrayListRunner {

	private <T> void iterateList(List<T> list) {
		Iterator <T>iterator=list.iterator();
		System.out.print("\nThe elements present in the list are ::");
		while(iterator.hasNext()) {
			T type=iterator.next();
			System.out.print(type);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		boolean value=true;
		
		ArrayListRunner tester=new ArrayListRunner();
		ArrayListMethod2 method=new ArrayListMethod2();
		IntegerObjectArray getIntegerArray=new IntegerObjectArray();
		IntegerMethod getInt=new IntegerMethod();
		GetString inputString=new GetString();
		StringArray inputArray=new StringArray();
		FloatObjectArray getFloat=new FloatObjectArray();
		LongObjectArray getLong=new LongObjectArray();
		
		while(value) {
			System.out.println("Enter the choice:");
			int choice=getInt.isInteger(input);
			switch(choice) {
				
				case 1:{
					List list=method.getArrayList(1);
					try {
						System.out.println("The size of ArrayList is :: "+method.getSize(list));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 2:{
					List<String> list=method.getArrayList("");
					try {
							input.nextLine();
							String [] words=inputArray.getStringArray(input);
							System.out.println("ArrayList after adding strings:: "+method.getStringAddedList(list,words));
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
							
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 3:{
					List<Integer> list=method.getArrayList(1);
					try {
							Integer [] numbers=getIntegerArray.getIntArray(input);
							System.out.println("ArrayList after adding integers:: "+method.getIntegerAddedList(list,numbers));
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
						}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 4:{
					List<ArrayListRunner> list=method.getArrayList(tester);
					System.out.println("Enter the number of objects to be created::");
					int count=getInt.isInteger(input);
					try {
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
							list=method.getObjectAddedList(list,count);
							System.out.println(list);
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
						}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 5:{
					List list=method.getArrayList(tester);
					
					System.out.println("Enter the number of objects to be created::");
					int count=getInt.isInteger(input);
					try {
							input.nextLine();
							String [] words=inputArray.getStringArray(input);
							list=method.getStringAddedList(list, words);
							Integer [] numbers=getIntegerArray.getIntArray(input);
							list=method.getIntegerAddedList(list, numbers);
							list=method.getObjectAddedList(list,count );
							System.out.println("The Arraylist obtained ::"+list);
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
						}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 6:{
					List<String> list=method.getArrayList("");
					try {
							input.nextLine();
							String [] words=inputArray.getStringArray(input);
							System.out.println("ArrayList after adding strings:: "+method.getStringAddedList(list,words));
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
							System.out.println("Enter the string to find index ::");
							String search=inputString.getString(input);
							System.out.println("The index of"+search+"::"+method.getFirstIndexOf(list, search));
							
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
			
				}
				case 7:{
					List<String> list=method.getArrayList("");
					try {
							input.nextLine();
							String [] words=inputArray.getStringArray(input);
							list=method.getStringAddedList(list,words);
							tester.iterateList(list);
							
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 8:{
					List<String> list=method.getArrayList("");
					try {
							input.nextLine();
							String [] words=inputArray.getStringArray(input);
							System.out.println("ArrayList after adding strings:: "+method.getStringAddedList(list,words));
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
							System.out.println("Enter the index to get string from the list::");
							int location=getInt.isInteger(input);
							System.out.println("The String present in the Index"+location+"in the list is::"+method.getAtIndex(list, location));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					
				}
				case 9:{
					List<String> list=method.getArrayList("");
					try {
							input.nextLine();
							String [] words=inputArray.getStringArray(input);
							System.out.println("ArrayList after adding strings:: "+method.getStringAddedList(list,words));
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
							System.out.println("Enter the string to find index ::");
							String search=inputString.getString(input);
							System.out.println("The First occurence of"+search+"::"+method.getFirstIndexOf(list, search));
							System.out.println("The Last occurence of"+search+"::"+method.getLastIndexOf(list, search));
							
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
			
				}
				case 10:{
					List<String> list=method.getArrayList("");
					try {
							input.nextLine();
							String [] words=inputArray.getStringArray(input);
							System.out.println("ArrayList after adding strings:: "+method.getStringAddedList(list,words));
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
							System.out.println("Enter the string to be inserted ::");
							String insert=inputString.getString(input);
							System.out.println("Enter the index where the string to be inserted::");
							int location=getInt.isInteger(input);
							list=method.getStringInsertedList(list, insert,location);
							System.out.println(list);
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
			
				}
				case 11:{
					List<String> list1=method.getArrayList("");
					List<String> list2=method.getArrayList("");
					try {
						input.nextLine();
						String [] words=inputArray.getStringArray(input);
						list1=method.getStringAddedList(list1,words);
						System.out.println("ArrayList after adding strings:: "+list1);
						System.out.println("The size of ArrayList is :: "+method.getSize(list1));
						System.out.println("Enter the starting index ::");
						int start=getInt.isInteger(input);
						System.out.println("Enter the ending index ::");
						int end=getInt.isInteger(input);
						list2=method.getSubList(list1,list2,start,end);
						System.out.println("The obtained list from first arraylist is::"+list2);
				}catch(CreatedException e) {
					System.out.println(e);
				}
				System.out.println();
				break;
				}
				
				case 12:{
					List<String> list1=method.getArrayList("");
					List<String> list2=method.getArrayList("");
					List<String> list3=method.getArrayList("");
					try {
						input.nextLine();
						String [] words1=inputArray.getStringArray(input);
						list1=method.getStringAddedList(list1,words1);
						System.out.println("ArrayList 1 after adding strings:: "+list1);
						System.out.println("The size of ArrayList 1 is :: "+method.getSize(list1));
						input.nextLine();
						String [] words2=inputArray.getStringArray(input);
						list2=method.getStringAddedList(list2,words2);
						System.out.println("ArrayList 2 after adding strings:: "+list2);
						System.out.println("The size of ArrayList 2 is :: "+method.getSize(list2));
						list3=method.getArrayListInserted(list1,list3);
						list3=method.getArrayListInserted(list2, list3);
						System.out.println("ArrayList 3 after inserting ArrayList 1&2::"+list3);
						}catch(CreatedException e) {
					System.out.println(e);
				}
				System.out.println();
				break;
				}
				
				case 13:{
					List<String> list1=method.getArrayList("");
					List<String> list2=method.getArrayList("");
					List<String> list3=method.getArrayList("");
					try {
						input.nextLine();
						String [] words1=inputArray.getStringArray(input);
						list1=method.getStringAddedList(list1,words1);
						System.out.println("ArrayList 1 after adding strings:: "+list1);
						System.out.println("The size of ArrayList 1 is :: "+method.getSize(list1));
						input.nextLine();
						String [] words2=inputArray.getStringArray(input);
						list2=method.getStringAddedList(list2,words2);
						System.out.println("ArrayList 2 after adding strings:: "+list2);
						System.out.println("The size of ArrayList 2 is :: "+method.getSize(list2));
						list3=method.getArrayListInserted(list2,list3);
						list3=method.getArrayListInserted(list1, list3);
						System.out.println("ArrayList 3 after inserting ArrayList 1&2::"+list3);
						}catch(CreatedException e) {
					System.out.println(e);
				}
				System.out.println();
				break;
				}
				
				case 14:{
					List<Float> list=method.getArrayList(1.1F);
					try {
						Float [] numbers=getFloat.getFloatArray(input);
						list=method.getFloatAddedList(list,numbers);
						System.out.println("ArrayList after adding integers:: "+list);
						System.out.println("The size of ArrayList is :: "+method.getSize(list));
						list=method.removeElement(list,0);
						System.out.println("ArrayList after deleting the 0th element::"+list);
						System.out.println("The size of ArrayList is :: "+method.getSize(list));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 15:{
					List<Float> list=method.getArrayList(1.1F);
					try {
						Float [] numbers=getFloat.getFloatArray(input);
						list=method.getFloatAddedList(list,numbers);
						System.out.println("ArrayList after adding float:: "+list);
						System.out.println("The size of ArrayList is :: "+method.getSize(list));
						System.out.println("Enter the index of the element to be removed::");
						int index=getInt.isInteger(input);
						list=method.removeElement(list,index);
						System.out.println("ArrayList after deleting the "+index+"th element::"+list);
						System.out.println("The size of ArrayList is :: "+method.getSize(list));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 17:{
					List<String> list1=method.getArrayList("");
					List<String> list2=method.getArrayList("");
					try {
						input.nextLine();
						String [] words1=inputArray.getStringArray(input);
						list1=method.getStringAddedList(list1,words1);
						System.out.println("ArrayList after adding strings:: "+list1);
						System.out.println("The size of ArrayList is :: "+method.getSize(list1));
						
						input.nextLine();
						String [] words2=inputArray.getStringArray(input);
						list2=method.getStringAddedList(list2,words2);
						System.out.println("ArrayList after adding strings:: "+list2);
						System.out.println("The size of ArrayList is :: "+method.getSize(list2));
						
						list1=method.getAllCommonElementRemoved(list1,list2);
						System.out.println("The arrayList 1 after alteration"+list1);
						System.out.println("The size of ArrayList is :: "+method.getSize(list1));
						}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 18:{
					List<String> list1=method.getArrayList("");
					List<String> list2=method.getArrayList("");
					try {
						input.nextLine();
						String [] words1=inputArray.getStringArray(input);
						list1=method.getStringAddedList(list1,words1);
						System.out.println("ArrayList after adding strings:: "+list1);
						System.out.println("The size of ArrayList is :: "+method.getSize(list1));
						
						input.nextLine();
						String [] words2=inputArray.getStringArray(input);
						list2=method.getStringAddedList(list2,words2);
						System.out.println("ArrayList after adding strings:: "+list2);
						System.out.println("The size of ArrayList is :: "+method.getSize(list2));
						
						list1=method.getAllUncommonElementRemoved(list1,list2);
						System.out.println("The arrayList 1 after alteration"+list1);
						System.out.println("The size of ArrayList is :: "+method.getSize(list1));
						}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 19:{
					List<Long> list=method.getArrayList(1L);
					try {
						input.nextLine();
						Long [] words=getLong.getLongArray(input);
						list=method.getLongAddedList(list,words);
						System.out.println("ArrayList after adding long:: "+list);
						System.out.println("The size of ArrayList is :: "+method.getSize(list));
						list=method.getEmptyList(list);
						System.out.println("The lsit after removinf all::"+list);
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 20:{
					List<String> list=method.getArrayList("");
					try {
							input.nextLine();
							String [] words=inputArray.getStringArray(input);
							System.out.println("ArrayList after adding strings:: "+method.getStringAddedList(list,words));
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
							System.out.println("Enter the string to be found ::");
							String toFind=inputString.getString(input);
							if(method.isStringAvailable(list,toFind)) {
								System.out.println("The string "+toFind+" is present in the arraylist");
								System.out.println("The size of ArrayList is :: "+method.getSize(list));
								System.out.println();
								break;
							}
							System.out.println("The string "+toFind+" is not present in the arraylist");
							System.out.println("The size of ArrayList is :: "+method.getSize(list));
							System.out.println();
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				
				}
				case 21:{
					value=false;
					System.out.println("Have a good day......The program is turned off............");
					System.out.println();
					break;
				}
				default:
					System.out.println("The entered choice is invalid ...Enter  proper choice");
					break;
				}
			}
		input.close();
		}

}
