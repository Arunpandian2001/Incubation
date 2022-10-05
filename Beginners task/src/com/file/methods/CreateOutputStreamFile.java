package com.file.methods;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import com.util.getvalues.MultipleStringArray;

public class CreateOutputStreamFile {
	
	public OutputStream newFile() throws Exception {
		OutputStream file=new FileOutputStream("/home/inc1/AP/apcodings/FileOutput/sample.txt");
		return file;
	}
	
	public void writeNewFile(Scanner input) throws Exception{
		
		MultipleStringArray inputStringLine=new MultipleStringArray();
		try(OutputStream writeFile=newFile()) {
			String[] contents=inputStringLine.getStringArray(input);
			for(String content : contents) {
				content+="\n";
				byte[] toBytes=content.getBytes();
				writeFile.write(toBytes);
			}
			//writeFile.close();
			input.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
}
