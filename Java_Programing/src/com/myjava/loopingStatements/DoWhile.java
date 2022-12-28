package com.myjava.loopingStatements;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		int x, range; //declaration
		x=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the range of values to be printed:");
		range=sc.nextInt();
		do{
			System.out.print(x+" ");
			x++;
		}while(x>0 && x<=range);
		System.out.println("out of do-while loop");
	}

}
