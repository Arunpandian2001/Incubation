package com.regex.method;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.arraylist.methods.ArrayListMethod2;
import com.hashmap.methods.HashMapMethods;
import com.util.exceptions.NullCheck;

import createdexception.CreatedException;

public class RegexMethod {
	
	NullCheck isNull=new NullCheck();
	ArrayListMethod2 listMethod=new ArrayListMethod2();
	HashMapMethods mapMethod=new HashMapMethods();

	public boolean isMobileNumber(String mobileNumber) throws CreatedException {
		isNull.nullCheck(mobileNumber);
		
		return (Pattern.matches("[789]{1}[\\d]{9}", mobileNumber));
	}
	
	public boolean isAlphaNumeric(String alphaNumeric) throws CreatedException {
		isNull.nullCheck(alphaNumeric);
		
		return (alphaNumeric.matches("^[\\w]+ [^_]$"));
	}
	
	public boolean isStartString(String REGEX,String matcherString) throws CreatedException {
		isNull.nullCheck(matcherString);
		isNull.nullCheck(REGEX);
		
		return Pattern.compile("^"+REGEX).matcher(matcherString).find();
	}
	
	public boolean isContainsString(String REGEX,String matcherString) throws CreatedException {
		isNull.nullCheck(matcherString);
		isNull.nullCheck(REGEX);
		
		String character=".*";
		return Pattern.compile(character+REGEX+character).matcher(matcherString).find();
	}
	
	public boolean isEndsString(String REGEX,String matcherString) throws CreatedException {
		isNull.nullCheck(matcherString);
		isNull.nullCheck(REGEX);
		
		return Pattern.compile(REGEX+"$").matcher(matcherString).find();
	}
	public boolean isMatchingsString(String REGEX,String matcherString) throws CreatedException {
		isNull.nullCheck(matcherString);
		isNull.nullCheck(REGEX);
		
		return Pattern.compile(REGEX).matcher(matcherString).matches();
	}
	
	public boolean isMatchingIgnoringCases(List<String> list,String REGEX,String matcherString) throws CreatedException {
		isNull.nullCheck(matcherString);
		isNull.nullCheck(REGEX);
		
		return Pattern.compile(REGEX,Pattern.CASE_INSENSITIVE).matcher(matcherString).find();
	}
	
	public boolean isEmailValid(String matcherString) throws CreatedException {
		isNull.nullCheck(matcherString);
		
		return Pattern.compile("^[^.](.+)@[^.]{1}(.+)[^.@]$").matcher(matcherString).find();
	}
	
	public boolean isLengthValid(List<String> list,String matcherString) throws CreatedException {
		isNull.nullCheck(matcherString);
		
		return Pattern.matches("^\\w{1,6}$", matcherString);
	}
	
	public Map<String,Integer> getCommonStringMap(List<String> list1,List<String> list2,Map<String,Integer> map) throws CreatedException{
		isNull.nullCheck(map);
		
		int sizeOfList1=listMethod.getSize(list1);
		int sizeOfList2=listMethod.getSize(list2);
	
		for(int i=0;i<sizeOfList1;i++) {
			for(int j=0;j<sizeOfList2;j++) {
				
				if(Pattern.matches(list1.get(i), list2.get(j)))
					map.put(list2.get(j), i);
			}
		}
		return map;
	}
	
	public List<String>  getHTMLTags(String htmlString,List<String> tagList) throws CreatedException{
		isNull.nullCheck(htmlString);
		isNull.nullCheck(tagList);
		
		Pattern pattern=Pattern.compile("</?[a-zA-Z]*>");
		
		Matcher match=pattern.matcher(htmlString);
		
		while(match.find()) {
			tagList.add(match.group());
		}
		
		return tagList;
	}
	
	
}	
