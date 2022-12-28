package com.myjava.readinnWritingFiles;

import java.io.*;
import java.util.Properties;
public class ReadPropertyFile {
	
	String filePath="D:\\Automation Testing Classes\\Java_Programing\\resources\\TestData.properties";
	public static void main(String[] args) {
		
	try{
		ReadPropertyFile obj= new ReadPropertyFile();
		File f= new File(obj.filePath);
		//Reading the property file
		FileInputStream fi=new FileInputStream(f);
		Properties props=new Properties();
		try {
			props.load(fi);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fi.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		String s=props.getProperty("name");
		System.out.println(s);
		System.out.println(props.getProperty("designation"));
		
		//write the data to property file
		File file= new File("D:\\Automation Testing Classes\\Java_Programing\\resources\\Input.properties");
		FileOutputStream fo=new FileOutputStream(file);
		Properties props1=new Properties();
		
		props1.setProperty("Organisation", "TCS");
		props1.setProperty("Country", "India");
		try {
			props1.store(fo, "Added couple of personal details");
		} catch (IOException e) {

			e.printStackTrace();
		}
		finally{
			try {
				fo.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}catch(FileNotFoundException fe){
			System.out.println("please provide proper path of the file");
	}
	
		
	}

}
