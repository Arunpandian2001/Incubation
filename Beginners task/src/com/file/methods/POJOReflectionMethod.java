package com.file.methods;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class POJOReflectionMethod {
	
	
	
	
	public Class<?> getClassInstance(String classPath)  {
		Class<?> classObtained = null;
		try {
			classObtained= Class.forName("com.file.methods.POJOReflection");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return classObtained;
	}
	
	public  Constructor<?> getDefaultConstructorInstance(Class <?> classInstance){
		 Constructor<?> constructorObtained=null;
		try {
			constructorObtained=classInstance.getDeclaredConstructor();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return constructorObtained;
	}

	public Constructor<?> getOverloadedConstructorInstance(Class<?> toFind, Class<String> class1,
			Class<Integer> class2) {
		Constructor<?> constructorObtained=null;
		try {
			constructorObtained=toFind.getDeclaredConstructor(class1,class2);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return constructorObtained;
	}

	public Object getObjectInstance(Constructor<?> constructor) {
		Object objectObtained=null;
		try {
			objectObtained=constructor.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return objectObtained;
	}

	public Object getObjectInstance(Constructor<?> constructor, String string, int number) {
		Object objectObtained=null;
		try {
			objectObtained=constructor.newInstance(string,number);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return objectObtained;
	}

	public Method getGetMethods(Class<?> classInstance, String methodName) {
		Method methodObtained=null;
		try {
			methodObtained=classInstance.getDeclaredMethod(methodName);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return methodObtained;
	}

	public Method getSetMethods(Class<?> classInstance, String methodName, Class <Integer> class1) {
		Method methodObtained=null;
		try {
			methodObtained=classInstance.getDeclaredMethod(methodName,class1);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return methodObtained;
	}
	
	
	
}
