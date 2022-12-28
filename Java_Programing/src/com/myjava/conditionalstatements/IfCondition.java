package com.myjava.conditionalstatements;

import java.util.Scanner;
public class IfCondition {
	public static void main(String[] args) {
		int ageOfVoter;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the age of the voter:");
		ageOfVoter=sc.nextInt();
		if(ageOfVoter>=18)
			System.out.println("He/She is eligible for vote");
		else
			System.out.println("He/She is not eligible for vote");
		
		
		
	}

}
