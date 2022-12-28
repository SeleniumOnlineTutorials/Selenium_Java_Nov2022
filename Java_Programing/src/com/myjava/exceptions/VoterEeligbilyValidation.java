package com.myjava.exceptions;

import java.util.Scanner;

import com.myjava.customExceptions.AgeValidationException;

public class VoterEeligbilyValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int age=sc.nextInt();
		AgeValidation av=new AgeValidation();
		try{
			av.agevalidate(age);
		}catch(AgeValidationException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("code continues");
	}

}
