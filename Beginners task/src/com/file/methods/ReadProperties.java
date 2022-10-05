package com.file.methods;

import java.util.Properties;

public class ReadProperties {
	
	MakeAndSetProperties writeFile=new MakeAndSetProperties();
	public void readProperties(Properties prop) {
		
		try {
			prop.list(System.out);
			writeFile.writeProp(prop);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
