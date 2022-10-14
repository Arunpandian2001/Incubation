package com.file.runner;

import java.lang.reflect.Method;
import java.util.Scanner;

import com.file.methods.POJOReflectionMethod;

import java.lang.reflect.Constructor;
public class POJOReflectionRunner {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the class path");
		String classPath=input.next();
		POJOReflectionMethod reflectionMethod=new POJOReflectionMethod();
		System.out.println("Enter the class path");
		String methodName=input.next();
		
		try {
			Class<?> toFind=reflectionMethod.getClassInstance(classPath);
			Constructor<?> constructor1=reflectionMethod.getDefaultConstructorInstance(toFind);
			Constructor<?> constructor2=reflectionMethod.getOverloadedConstructorInstance(toFind,String.class,int.class);
			
			Object obj1 = reflectionMethod.getObjectInstance(constructor1);
			Method meth1 =reflectionMethod.getSetMethods(toFind,methodName,int.class);
			meth1.invoke(obj1, 23);
			Method meth2 = toFind.getDeclaredMethod("getNum");
			System.out.println(meth2.invoke(obj1)); 
			
			
			Object obj2 = reflectionMethod.getObjectInstance(constructor2,"ap",21);
			Method meth3 = reflectionMethod.getGetMethods(toFind,methodName);
			System.out.println(meth3.invoke(obj2)); 
			Method meth4 = toFind.getDeclaredMethod("getNum");
			System.out.println(meth4.invoke(obj2)); 
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		input.close();
	}

}

//		System.out.println("Enter the input type in method ");
//		String inputClassType=input.next();
//		Class <?> inputClassTypes=inputClassType.getClass();