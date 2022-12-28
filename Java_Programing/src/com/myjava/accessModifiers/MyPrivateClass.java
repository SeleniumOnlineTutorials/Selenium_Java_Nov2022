package com.myjava.accessModifiers;

public class MyPrivateClass {

	
	public int x,y;
	String s;
	
	public int sum(int a, int b){
		x=a;
		y=b;
		return x+y;
	}
	
	public String reverse(String st)
	{
		s=st;
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}
