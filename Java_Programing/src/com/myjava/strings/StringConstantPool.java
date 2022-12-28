package com.myjava.strings;

public class StringConstantPool {
	
	public static void main(String[] args) {
		String s="testing";
		String str="testing";
		System.out.println(s);
		System.out.println(str);
		System.out.println("-----------------------------");
		s="apple";
		System.out.println(s);
		System.out.println(str);
		
		System.out.println("-----------------------------");
		String st=new String("My String");
		System.out.println(st);
		
	}

}
