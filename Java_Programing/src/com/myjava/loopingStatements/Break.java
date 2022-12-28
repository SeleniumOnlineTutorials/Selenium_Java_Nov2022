package com.myjava.loopingStatements;

import java.util.Scanner;

public class Break {
	
	int y;
	String s;
	char ch;
	
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integert utill zero:");
		
		while(true){
			int x=sc.nextInt();
			if(x==0)
				continue;
			sum=sum+x;
		}
		//System.out.println(sum);
	}

}
