package com.myjava.conditionalstatements;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		int x,y,z;
		String arithmeticOperator;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the Arthmetic operation");
		arithmeticOperator=sc.next();
		System.out.println("Please enter the a,x and z values");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
			
		switch(arithmeticOperator){
		
			case "sum":
				if(x>0 && y>0)
				System.out.println("sum of x and y values: "+ (x+y));
				else
					System.out.println("x and y values are negative values");
				break;
			case "sub":
				System.out.println("sub of x and y values: "+ (x-y));
				break;
			case "div":
				System.out.println("div of y and z values: "+ (y/z));
				break;
			case "mul":
				System.out.println("mul of y and z values: "+ (y*z));
				break;
			default:
				System.out.println("please enter the valid aritmetic operation");
				break;
		
		}
		System.out.println("came out of switch block");
	}

}
