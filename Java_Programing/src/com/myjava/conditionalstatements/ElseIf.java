package com.myjava.conditionalstatements;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number");
		num=sc.nextInt();
		
		if(num>0){
		System.out.println("Given number is positive number");	
		}
		else if(num<0){
			System.out.println("Given number is negative number");	
		}
		else if(num==0){
			System.out.println("Given number is zero");	
		}
		else
			System.out.println("please enter a valid integer");	
	}

}
