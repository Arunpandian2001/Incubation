package com.hashmap.runner;
import com.hashmap.methods.*;
import createdexception.CreatedException;
public class SanityCheck {
	HashMapMethods method=new HashMapMethods();
	public int num=0;
	public Integer[] intArray=null;
		public SanityCheck () throws CreatedException {
			//num=method.getStringArrayLength(null);
			int len=method.getIntArrayLength(intArray);
			
		}
		
}
