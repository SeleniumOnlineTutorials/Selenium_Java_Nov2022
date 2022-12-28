package com.myjava.loopingStatements;

import java.util.Scanner;

public class AcceptIntegersTillzeroAndPrintSum {
	
	public static void main(String[] args) {
		int x,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integert utill zero:");
		do{
			x=sc.nextInt();
			sum=sum+x;
		}while(x!=0);
		System.out.println(sum);
		
		
		
	}

}
