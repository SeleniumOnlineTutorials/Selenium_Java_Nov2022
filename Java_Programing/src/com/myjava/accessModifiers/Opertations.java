package com.myjava.accessModifiers;

public class Opertations {
	
	public static void main(String[] args) {
		MyPrivateClass obj=new MyPrivateClass();
		System.out.println(obj.x);
		int sum=obj.sum(34, 45);
		String s=obj.reverse("reverse of string");
		System.out.println(sum);
		System.out.println(s);
		
		
	}

}
