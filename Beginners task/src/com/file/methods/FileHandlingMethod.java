package com.file.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.util.exceptions.NullCheck;

import createdexception.CreatedException;

public class FileHandlingMethod {
	
	NullCheck isNull=new NullCheck();
	public OutputStream newFile(String fileName) throws FileNotFoundException {

		OutputStream file=new FileOutputStream(fileName);
		return file;
	}
	
	public void writeNewFile(String fileName ,String...contents) throws IOException, CreatedException{//swami
			isNull.nullCheck(contents);
			try(OutputStream writeFile=newFile(fileName)) {
				for(String content : contents) {
					content+="\n";
					byte[] toBytes=content.getBytes();
					writeFile.write(toBytes);
				}
				writeFile.flush();
			}
	}
	
	public Properties makeProp(String key,String value,Properties prop) {
		
		prop.put(key, value);
		
		return prop;
	}
	
	public void writeProp(String fileName,Properties prop) throws FileNotFoundException, IOException  {

		try(OutputStream file=new FileOutputStream(fileName)){
			prop.store(file, "Comments");
			}
	}
	
	public Properties readProperties(String fileName, Properties prop) throws FileNotFoundException, IOException {
		try(InputStream stream=new FileInputStream(fileName);){
			prop.load(stream);
		}
		return prop;
	}
		
	public boolean makeDirectory(String location) {
		
		File makeDir=new File(location);
		return makeDir.mkdir();
		
	}

	
}
