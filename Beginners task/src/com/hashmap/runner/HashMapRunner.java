package com.hashmap.runner;
import createdexception.CreatedException;

import java.util.HashMap;
import java.util.Scanner;

import com.hashmap.methods.HashMapMethods;
import com.util.getvalues.*;

public class HashMapRunner {
	
	
	public static void main(String[] args) throws CreatedException  {
		Scanner input=new Scanner(System.in);
		IntegerMethod getInt=new IntegerMethod();
		HashMapMethods method=new HashMapMethods ();
		HashMapRunner runner=new HashMapRunner();
		StringArray inputArray=new StringArray();
		IntegerObjectArray intObjArray=new IntegerObjectArray();
		GetString inputString=new GetString();
		boolean value=true;
		SanityCheck sanity=new SanityCheck();
		while(value) {
			System.out.println("Enter the choice::");
			int choice=getInt.isInteger(input);
			switch(choice) {
			
				case 1:{
					HashMap<Integer,Integer> map=method.getHashMap(1,1);
					try {
						System.out.println("The map is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 2:{
					HashMap<String,String> map=method.getHashMap("","");
					try {
						System.out.println("Keys");
						String[] keys=inputArray.getStringArray(input);
						System.out.println("Values");
						String[] values=inputArray.getStringArray(input);
						map=method.getStringMap(map,keys,values);
						System.out.println("The map is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 3:{
					HashMap<Integer,Integer> map=method.getHashMap(1,1);
					try {
						System.out.println("Keys");
						Integer[] keys=intObjArray.getIntArray(input);
						System.out.println("Values");
						Integer[] values=intObjArray.getIntArray(input);
						map=method.getIntegerMap(map,keys,values);
						System.out.println("The map is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 4:{
					HashMap<String,Integer> map=method.getHashMap("",1);
					try {
						System.out.println("Values");
						Integer[] values=intObjArray.getIntArray(input);
						System.out.println("Keys");
						String[] keys=inputArray.getStringArray(input);
						map=method.getStringIntegerMap(map,keys,values);
						System.out.println("The map is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 5:{
					HashMap<String,HashMapRunner> map=method.getHashMap("",runner);
					try {
						System.out.println("Keys");
						String[] keys=inputArray.getStringArray(input);
						System.out.println("Values");
						System.out.println("Enter the number of objects to be created::");
						int count=getInt.isInteger(input);
						map=method.getStringObjectMap(map,keys,count);
						System.out.println("The map is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 6:{
					HashMap<String,String> map=method.getHashMap("","");
					try {
						System.out.println("Keys");
						String[] keys=inputArray.getStringArray(input);
						System.out.println("Values");
						String[] values=inputArray.getStringArray(input);
						map=method.getStringNullPointedMap(map,keys,values);
						System.out.println("The map is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 7:{
					HashMap<String,String> map=method.getHashMap("","");
					try {
						String key=null;
						System.out.println("Value");
						String values=inputString.getString(input);
						map=method.getStringNullKeyMap(map,key,values);
						System.out.println("The map is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 8:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try {
							System.out.println("Values");
							Integer[] keys=intObjArray.getIntArray(input);
							System.out.println("Keys");
							String[] values=inputArray.getStringArray(input);
							map=method.getIntegerStringMap(map,keys,values);
							System.out.println("The size of map is::"+method.getMapSize(map));
							System.out.println("Enter the key to search");
							Integer toFindKey=new Integer(getInt.isInteger(input));
							method.mapContainsKey(map,toFindKey);
							System.out.println("The key "+toFindKey+" is present in the Map ");
							System.out.println();
							break;
							
						}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				
				}
				
				case 9:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try {
						System.out.println("Values");
						Integer[] keys=intObjArray.getIntArray(input);
						System.out.println("Keys");
						String[] values=inputArray.getStringArray(input);
						map=method.getIntegerStringMap(map,keys,values);
						System.out.println("The size of map is::"+method.getMapSize(map));
						System.out.println("Enter the key to search");
						String toFindValue=inputString.getString(input);
						method.mapContainsValue(map,toFindValue);
						System.out.println("The value "+toFindValue+" is present in the Map ");
						System.out.println();
						break;
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 10:{
					HashMap<String,String> map=method.getHashMap("","");
					try {
						System.out.println("Keys");
						String[] keys=inputArray.getStringArray(input);
						System.out.println("Values");
						String[] values=inputArray.getStringArray(input);
						map=method.getStringMap(map,keys,values);
						System.out.println("The map is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
						System.out.println("Enter the values to be replaced ");
						String[] replaceValues=inputArray.getStringArray(input);
						map=method.getReplacedValues(map,keys,replaceValues);
						System.out.println("The map is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				
				}
				
				case 11:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try {
						System.out.println("Values");
						Integer[] keys=intObjArray.getIntArray(input);
						System.out.println("Keys");
						String[] values=inputArray.getStringArray(input);
						map=method.getIntegerStringMap(map,keys,values);
						System.out.println("The size of map is::"+method.getMapSize(map));
						System.out.println("Enter the key to get value");
						Integer toFindValue=new Integer(getInt.isInteger(input));
						method.mapContainsKey(map,toFindValue);
						System.out.println("The value associated with the key "+toFindValue+" is::"+method.getValue(map,toFindValue));
						System.out.println();
						break;
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 12:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try {
						System.out.println("Values");
						Integer[] keys=intObjArray.getIntArray(input);
						System.out.println("Keys");
						String[] values=inputArray.getStringArray(input);
						map=method.getIntegerStringMap(map,keys,values);
						System.out.println("The size of map is::"+method.getMapSize(map));
						System.out.println("Enter the key to get value");
						Integer toFindValue=new Integer(getInt.isInteger(input));
						System.out.println("The value associated with the key "+toFindValue+" is::"+method.getValue(map,toFindValue));
						System.out.println();
						break;
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 13:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try {
						System.out.println("Values");
						Integer[] keys=intObjArray.getIntArray(input);
						System.out.println("Keys");
						String[] values=inputArray.getStringArray(input);
						map=method.getIntegerStringMap(map,keys,values);
						System.out.println("The size of map is::"+method.getMapSize(map));
						System.out.println("Enter the key to get value");
						Integer toFindValue=new Integer(getInt.isInteger(input));
						System.out.println("Enter the String to be printed if the key does not exist ::");
						String resultSring=inputString.getString(input);
						System.out.println("The value associated with the key "+toFindValue+" is::"+method.getNullValueAsString(map,toFindValue,resultSring));
						System.out.println();
						break;
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 14:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try {
							System.out.println("Values");
							Integer[] keys=intObjArray.getIntArray(input);
							System.out.println("Keys");
							String[] values=inputArray.getStringArray(input);
							map=method.getIntegerStringMap(map,keys,values);
							System.out.println("The size of map is::"+method.getMapSize(map));
							System.out.println("Enter the key to remove value");
							Integer toRemoveKey=new Integer(getInt.isInteger(input));
							method.mapContainsKey(map,toRemoveKey);
							String removedValue=method.getKeyRemoved(map,toRemoveKey);
							System.out.println("The value associated with the key "+toRemoveKey+" is removed and the Value removed is ::"+removedValue);
							System.out.println("The size of map is::"+method.getMapSize(map));
							System.out.println();
							break;
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 15:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try {
						System.out.println("Values");
						Integer[] keys=intObjArray.getIntArray(input);
						System.out.println("Keys");
						String[] values=inputArray.getStringArray(input);
						map=method.getIntegerStringMap(map,keys,values);
						System.out.println("The size of map is::"+method.getMapSize(map));
						System.out.println("Enter the key to remove value");
						Integer toRemoveKey=new Integer(getInt.isInteger(input));
						System.out.println("Enter the String present in the key ::");
						String toRemoveValue=inputString.getString(input);
						method.mapContainsKey(map,toRemoveKey);
						map=method.getKeyRemovedWithValue(map,toRemoveKey,toRemoveValue);
						System.out.println("The map present is ::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
						System.out.println();
						break;
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 16:{
					
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try {
							System.out.println("Values");
							Integer[] keys=intObjArray.getIntArray(input);
							System.out.println("Keys");
							String[] values=inputArray.getStringArray(input);
							map=method.getIntegerStringMap(map,keys,values);
							System.out.println("The size of map is::"+method.getMapSize(map));
							System.out.println("Enter the key to remove value");
							Integer toRemoveKey=new Integer(getInt.isInteger(input));
							System.out.println("Enter the String to be replaced in the key ::");
							String toReplaceValue=inputString.getString(input);
							
							method.mapContainsKey(map,toRemoveKey);
							map=method.getReplacedValue(map,toRemoveKey,toReplaceValue);
							System.out.println("The map present is ::"+map);
							System.out.println("The size of map is::"+method.getMapSize(map));
							System.out.println();
							break;
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 17:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try {
							System.out.println("Values");
							Integer[] keys=intObjArray.getIntArray(input);
							System.out.println("Keys");
							String[] values=inputArray.getStringArray(input);
							map=method.getIntegerStringMap(map,keys,values);
							System.out.println("The size of map is::"+method.getMapSize(map));
							System.out.println("Enter the key to remove value");
							Integer toRemoveKey=new Integer(getInt.isInteger(input));
							System.out.println("Enter the String present in the key ::");
							String toRemoveValue=inputString.getString(input);
							System.out.println("Enter the String to be replaced in the key ::");
							String toReplaceValue=inputString.getString(input);
							
							method.mapContainsKey(map,toRemoveKey);
							method.mapContainsValue(map, toRemoveValue);
							map=method.getReplacedByValue(map,toRemoveKey,toRemoveValue,toReplaceValue);
							System.out.println("The map present is ::"+map);
							System.out.println("The size of map is::"+method.getMapSize(map));
							System.out.println();
							break;
						
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 18:{
					HashMap<Integer,String> map1=method.getHashMap(1,"");
					HashMap<Integer,String> map2=method.getHashMap(1,"");

					try {
							System.out.println("Values");
							Integer[] keys1=intObjArray.getIntArray(input);
							System.out.println("Keys");
							String[] values1=inputArray.getStringArray(input);
							map1=method.getIntegerStringMap(map1, keys1, values1);
							System.out.println("The size of map 1 is::"+method.getMapSize(map1));
							System.out.println("The size of map 2 is::"+method.getMapSize(map2));
							map2=method.getAddedHashMap(map1,map2);
							System.out.println("Map 1 ::"+map1);
							System.out.println("The size of map 1 is::"+method.getMapSize(map1));
							System.out.println("Map 2 ::"+map2);
							System.out.println("The size of map 2 is::"+method.getMapSize(map2));

					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				case 19:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try{
							System.out.println("Values");
							Integer[] keys=intObjArray.getIntArray(input);
							System.out.println("Keys");
							String[] values=inputArray.getStringArray(input);
							map=method.getIntegerStringMap(map, keys, values);
							method.printKeyValue(map);
					}catch(CreatedException e) {
						System.out.println(e);
					}
					System.out.println();
					break;
				}
				
				case 20:{
					HashMap<Integer,String> map=method.getHashMap(1,"");
					try{
						System.out.println("Values");
						Integer[] keys=intObjArray.getIntArray(input);
						System.out.println("Keys");
						String[] values=inputArray.getStringArray(input);
						map=method.getIntegerStringMap(map, keys, values);
						System.out.println("The map present is::"+map);
						System.out.println("The size of map is::"+method.getMapSize(map));
						map=method.getClearedMap(map);
						System.out.println("The map present after deleting entries::"+map);
						System.out.println("The size of map after deleting entries::"+method.getMapSize(map));

					}catch(CreatedException e) {
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
				
				
				
				default:
					System.out.println("The entered choice is invalid ...Enter  proper choice");
					break;
				}
			}
		
		
		input.close();
	}
}
