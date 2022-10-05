package com.string.method;
import java.util.Objects;

import createdexception.CreatedException;

public class StringMethods {
	public void nullCheck(Object name)throws CreatedException{
		//object as parameter for string type and can be used for sting array and array list also
			if(Objects.isNull(name)){
				throw new CreatedException(" The entered Object is null. ");
			}
		}
		
		public void isIndexGreat(int length,int index)throws CreatedException{
			System.out.println(length+""+index);
			if(index>length){
					throw new CreatedException(" The length / index given is higher than the appropriate value ");
				}
		}
		public int getStringLength(String word)  throws CreatedException{
			nullCheck(word);
			return word.length();
		}
		public char[] getCharArray(String name)  throws CreatedException{
			nullCheck(name);
			char charArray[] = name.toCharArray();		
			return charArray;		
		}
		
		public boolean compareString(String name1 , String name2)  throws CreatedException{
			nullCheck(name1);
			nullCheck(name2);
			return name1.equals(name2);
		}
		
		public String getTrimmedString(String name)  throws CreatedException{
			nullCheck(name);
			return name.trim();
		}
		
		public char getCharFromLast(String name, int index) throws CreatedException  {
			nullCheck(name);
			int length=getStringLength(name);
			isIndexGreat(length,index);
			return name.charAt(length-index);
		}
		
		public int getLetterOccurence(char letter, String name)  throws CreatedException{
			int length=getStringLength(name);
			return getOccurenceCount(name,letter,length);
		}
		
		public int getGreatestLetterOccurence(char letter, String name)  throws CreatedException{
			
			return getOccurencePos(name,letter);
		}
		
		public int getOccurenceCount(String name ,char letter ,int length)  throws CreatedException{
			
			int count=0;
			for(int i=0;i<length;i++){
				if(name.charAt(i)==letter )
				{
					count++;
				}
			}
			return count;
		}
		
		public int getOccurencePos(String name,char letter)throws CreatedException{
			nullCheck(name);
			return name.lastIndexOf(letter);
		}
		
		
		public String findSubString(String name, int startIndex, int endIndex)  throws CreatedException{
			nullCheck(name);
			isIndexGreat(endIndex,startIndex);
			return name.substring(startIndex,endIndex);
		}
		public String firstString(String name, int number)  throws CreatedException{
			
			int startIndex=0;
			int endIndex=number;
			return findSubString(name,startIndex,endIndex);
			
		}
		
		public String lastString(String name, int number)  throws CreatedException{
			
			int length=getStringLength(name);
			int startIndex=length-number;
			int endIndex=length;
			return findSubString(name,startIndex,endIndex);
		}
		
		public String getReplaceChar(String name, String change, int option)  throws CreatedException{
			//To replace given string from first then pass option as 1
			//To replace given string from last then pass option as 2
			int nameLength=getStringLength(name);
			int changeLength=getStringLength(change);
			isIndexGreat(nameLength,changeLength);
			if(option>2){
				throw new CreatedException("The option given is inappropriate.");
			}
			else if(option ==1){
			
				int start=changeLength;
				int end=nameLength;
				String sub=findSubString(name,start,end);
				return stringCombine(change,sub);
			}
				
				int start=0;
				int end=nameLength-changeLength;
				String sub=findSubString(name,start,end);
				return stringCombine(sub,change);
		}
		
		public String stringCombine(String name, String change)  throws CreatedException{
			return name+change;
		}
		
		public boolean startString(String name,String check)  throws CreatedException{
			int checkLength=getStringLength(check);
			String sub=findSubString(name,0,checkLength);
			if(compareString(check,sub)){
				return true;
			}		
			return false;	
		}
		
		public boolean endString(String name,String check) throws CreatedException{
			int nameLength=getStringLength(name);
			int checkLength=getStringLength(check);
			int length=nameLength-checkLength;
			String sub=findSubString(name,length,nameLength);
			return compareString(check,sub);
		}
		
		public String lowerString(String name)  throws CreatedException{ 
				nullCheck(name);		
				return name.toLowerCase();
		}
		
		public String upperString(String name)  throws CreatedException{
				nullCheck(name);
				return name.toUpperCase();
		}
		
		public String reverseString(String name)  throws CreatedException{
			int nameLength=getStringLength(name);
			String convert="";
			for(int i=nameLength-1;i>=0;i--){
				convert=convert+name.charAt(i);
			}
			return convert;
		}
		
		public String getPrintString(String name)  throws CreatedException{
			return name;
		}
		
		public String[] getSplitToArr(String name)  throws CreatedException{
				
			String [] names=getTrimmedString(name).split("\\s+");
			return names;
		}
		
		public String getClearedWhiteSpace(String name)  throws CreatedException{
			nullCheck(name);	
			String remove=name.replace(" ","");
			return remove;
		}
		
		
		public String stringCombine(String name,char symbol ,String change)  throws CreatedException{
			return name+symbol+change;
		}
		
		public String getJoinedString(String[] names,String changeSymbol)  throws CreatedException{
				nullCheck(names);
				return String.join(changeSymbol,names);
			}	
			
		public String getClearedWhiteSpace(String name,char currentSymbol, char changeSymbol)  throws CreatedException{
			nullCheck(name);
			return name.replace(currentSymbol,changeSymbol);
		}
		
		public boolean getIgnoreCaseString(String name1, String name2)  throws CreatedException{
			nullCheck(name1);
			nullCheck(name2);
			return name1.equalsIgnoreCase(name2);
		}


}
