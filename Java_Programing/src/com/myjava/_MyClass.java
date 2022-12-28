package com.myjava;

import java.util.Scanner;

public class _MyClass {
	
	public static void main(String[] args) {
		int a; //declaration
		String s;
		float f;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the value of a::");
		a=sc.nextInt();
		System.out.println("please enter the value of s::");
		s=sc.next();
		System.out.println("please enter the value of f::");
		f=sc.nextFloat();
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(f);
		
	}

}
