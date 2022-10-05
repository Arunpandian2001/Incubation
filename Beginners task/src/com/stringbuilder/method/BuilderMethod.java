package com.stringbuilder.method;
import java.util.Objects;

import createdexception.CreatedException;
public class BuilderMethod {
	public StringBuilder getStringBuilder() {
		StringBuilder builder=new StringBuilder();
		return builder;
	}
	
	public void nullCheck(Object words) throws CreatedException{
		if(Objects.isNull(words)){
			throw new CreatedException("Object is null");
		}
	}
	
	public void compareIndex(int start,int end) throws CreatedException{
		if(start>end || start==-1 ) {
			throw new CreatedException("The index given is inappropriate");
		}
	}
	
	public void stringAvailablity(StringBuilder builder,String symbol)throws CreatedException {
		nullCheck(builder);
		nullCheck(symbol);
		if(builder.indexOf(symbol)==-1) {
			throw new CreatedException("The string entered is not present in the String Builder");
		}
	}
	public int getLength(StringBuilder builder)throws CreatedException{
		nullCheck(builder);
		return builder.length();
	}
	
	public int getLength(String name) throws CreatedException{
		nullCheck(name);
		return name.length();
	}
	
	public int getLength(String... name) throws CreatedException{
		nullCheck(name);
		return name.length;
	}
	
	public StringBuilder addStringBuilder(StringBuilder builder,String word)throws CreatedException {
		nullCheck(builder);
		return builder.append(word);
	}
	
	public StringBuilder appendSpace(StringBuilder builder,String insert)throws CreatedException {
		nullCheck(builder);
		return builder.append(insert);
	}
	
	
	public StringBuilder getCombinedStringBuilder(StringBuilder builder,String toReplaceChar,String... names) throws CreatedException{
		
		int length=getLength(names);
		
		for(int i=0;i<length-1;i++) {
			
			builder=builder.append(names[i]).append(toReplaceChar);
			
		}
		builder=builder.append(names[length-1]);
		return builder;
	}
	
	/*public StringBuilder getStringInserted(StringBuilder builder,String toReplaceChar,String insertCharacter)throws CreatedException {
		nullCheck(builder);
		int length=getLength(builder);
		char replaceCharacter=toReplaceChar.charAt(0);
		
		for(int i=0;i<length;i++) {//swami
			if(builder.charAt(i)==replaceCharacter) {
				builder=builder.insert(i+1,insertCharacter +" ");
				break;
			}
		}
		
		return builder;
	}
	*/
	public StringBuilder toDeleteString(StringBuilder builder,String word)throws CreatedException {
		nullCheck(builder);
		int length=getLength(word);
		int pos=builder.indexOf(word);
		if(pos==-1) {
			throw new CreatedException("The String is not present in the given sting builder");
		}
		builder=builder.delete(pos,pos+length);
//	}
	return builder;
}

	public StringBuilder getCharInserted(StringBuilder builder,String toReplaceChar,String insertCharacter)throws CreatedException {
		nullCheck(builder);
		
		
		int length=getLength(builder);
		char insert=insertCharacter.charAt(0);
		int position=0;
		for(int i=0;i<length;i++) {//swami
				position=builder.indexOf(toReplaceChar, i);
				if(position==-1) {
					
					break;
				}
				builder.setCharAt(position,insert);
				i=position+1;
				
		}
		
		return builder;
	}
	
	public StringBuilder getReverseStringBuilder(StringBuilder builder) throws CreatedException{
		nullCheck(builder);
		return builder.reverse();
	}
	
	public StringBuilder toDeleteAtIndex(StringBuilder builder,int startIndex, int endIndex)throws CreatedException {
		nullCheck(builder);
		builder=builder.delete(startIndex, endIndex);
		return builder;
	}

	public StringBuilder getReplacedString(StringBuilder builder,String word,int startIndex,int endIndex) throws CreatedException{
		nullCheck(builder);
		builder=builder.replace(startIndex,endIndex,word);
		return builder;
	}

	public int toFindLastIndex(StringBuilder builder,String symbol) throws CreatedException{
		nullCheck(builder);
		nullCheck(symbol);
		stringAvailablity(builder,symbol);
		return builder.lastIndexOf(symbol);
	}
	public int toFindFirstIndex(StringBuilder builder,String symbol) throws CreatedException{
		nullCheck(builder);
		nullCheck(symbol);
		stringAvailablity(builder,symbol);
		return builder.indexOf(symbol);
	}

	public StringBuilder getStringInserted(StringBuilder builder,String toReplaceChar,String insertCharacter)throws CreatedException {
		nullCheck(builder);
		int length=getLength(builder);
		int charLength=getLength(insertCharacter);
		int position=0;
		for(int i=0;i<length;i++) {//swami
				position=builder.indexOf(toReplaceChar, i);
				if(position==-1) {
					
					break;
				}
				builder=builder.insert(position+1,insertCharacter);
				i=position+charLength+1;
		}
		return builder;
	}
	public String concatString(String symbol) throws CreatedException{
		
		nullCheck(symbol);
		
		return symbol+" ";
	}


}
