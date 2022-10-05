package com.file.methods;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

import com.stringbuilder.method.BuilderMethod;

public class MakeAndSetProperties {

	public Properties makeProp(Scanner input,String[] key,String[] value) {
		Properties prop=new Properties();

		try {
			BuilderMethod stringLength=new BuilderMethod();
			int length=stringLength.getLength(value);
			for(int i=0;i<length;i++) {
				prop.put(key[i], value[i]);
			}
			writeProp(prop);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return prop;
	}
	
	public void writeProp(Properties prop) {
		try(OutputStream file=new FileOutputStream("/home/inc1/AP/apcodings/FileOutput/myprops.txt")) {
			prop.store(file, "Comments");
			//file.close();
			
			}catch(Exception e) {
			System.out.println(e);
		}
	}
}
