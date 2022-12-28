package com.myjava.loopingStatements;

import java.util.Scanner;

public class ReversingOfGivenNumber {
	public static void main(String[] args) {
		int x,rev=0,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		x=sc.nextInt();
		//2346 -- 6432
		while(x>0){
			y=x%10;
			rev=(rev*10)+y;
			x=x/10;
		}
		System.out.println(rev);
		
		for(;x>0;x=x/10){
			y=x%10;
			rev=(rev*10)+y;
		}		
		
		System.out.println(rev);
	}
}
