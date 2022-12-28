package com.java.ArraysInJava;

import java.util.Scanner;

public class StoringDataFromKeyboardInArray {
	
			
	public static void main(String[] args) {
		int sizeOfArray;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		sizeOfArray=sc.nextInt();
		int x[]=new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			x[i]=sc.nextInt();
		}
		System.out.println("------------------------------------");
		for(int i=0;i<sizeOfArray;i++)
		System.out.println(x[i]);
		System.out.println("------------------------------------");
		char ch[]={'2','a','f','r'};
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
	}

}
