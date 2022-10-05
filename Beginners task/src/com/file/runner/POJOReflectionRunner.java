package com.file.runner;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class POJOReflectionRunner {

	public static void main(String[] args) throws Exception {
		

		try {
			Class<?> toFind=Class.forName("com.file.methods.POJOReflectionMethod");
			Constructor<?> constructor1=toFind.getDeclaredConstructor();
			Constructor<?> constructor2=toFind.getDeclaredConstructor(String.class,int.class);
			
			Object obj1 = constructor1.newInstance();
			Method meth1 = toFind.getDeclaredMethod("setNum", int.class);
			meth1.invoke(obj1, 23);
			Method meth2 = toFind.getDeclaredMethod("getNum");
			System.out.println(meth2.invoke(obj1)); 
			
			
			Object obj2 = constructor2.newInstance("ap",21);
			Method meth3 = toFind.getDeclaredMethod("getStr");
			System.out.println(meth3.invoke(obj2)); 
			Method meth4 = toFind.getDeclaredMethod("getNum");
			System.out.println(meth4.invoke(obj2)); 
			
			
			
//			Object inst=toFind.newInstance();
//			Object const1=constructor1.newInstance();
//			Object const2=constructor2.newInstance("ap",1);
//
//			Method meth1= toFind.getMethod("setNum", int.class);
//			
//			Method meth2= toFind.getMethod("setStr", int.class);

			
			/*for(Method method : methods) {
				if(method.getName().equals("setStr")) {
					method.invoke(inst,num);
				}
				if(method.getName().equals("getStr")) {
					System.out.println(method.invoke(inst));
				}
			}*/
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
