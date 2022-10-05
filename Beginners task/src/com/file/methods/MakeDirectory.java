package com.file.methods;

import java.io.File;
import java.util.Properties;
import java.util.Scanner;

import com.util.getvalues.StringArray;

public class MakeDirectory {
	
	public void makeDirectory(Scanner input) throws Exception {
		
		CreateOutputStreamFile make=new CreateOutputStreamFile();
		StringArray stringArr=new StringArray();
		MakeAndSetProperties designProp=new MakeAndSetProperties();
		ReadProperties read=new ReadProperties();
		
		File makeDir=new File("/home/inc1/AP/apcodings/FileOutput");
		makeDir.mkdir();
		make.writeNewFile(input);
		String key[]=stringArr.getStringArray(input);
		String[] value=stringArr.getStringArray(input);
		Properties prop=designProp.makeProp(input,key,value);
		read.readProperties(prop);
	}
}
