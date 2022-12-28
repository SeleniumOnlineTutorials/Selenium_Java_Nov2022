package com.myjava;

import java.util.Scanner;
public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter x and y values:");
		x=sc.nextInt();
		y=sc.nextInt();
		int sum=x+y;
		System.out.println("Sum of x and Y:"+sum);
	}
}
