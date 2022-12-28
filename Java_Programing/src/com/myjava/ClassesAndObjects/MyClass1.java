package com.myjava.ClassesAndObjects;

import java.util.Scanner;

public class MyClass1 {
	
	int x,y;
	String str;
	
	public static void main(String[] args) {
		MyClass1 mc1=new MyClass1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x value:");
		mc1.x=sc.nextInt();
		System.out.println("Enter the str value:");
		mc1.str=sc.next();
		System.out.println("x value: "+ mc1.x);
		System.out.println("Str value: "+ mc1.str);
		System.out.println("y value: "+ mc1.y);
		
		MyClass1 mc11=new MyClass1();
		mc11.x=sc.nextInt();
		mc11.y=sc.nextInt();
		mc11.str=sc.next();
		System.out.println("------------------------------");
		System.out.println("x value: "+ mc11.x);
		System.out.println("Str value: "+ mc11.str);
		System.out.println("y value: "+ mc11.y);
	}

}
