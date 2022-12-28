package com.myjava.loopingStatements;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		int x, range; //declaration
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the range of values to be printed:");
		range=sc.nextInt();
		
		for(x=1;x>0;x++)
			System.out.println(x);
			
		
	}

}
