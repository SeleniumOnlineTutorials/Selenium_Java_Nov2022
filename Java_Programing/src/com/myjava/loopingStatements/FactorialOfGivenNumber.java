package com.myjava.loopingStatements;
import java.util.Scanner;

public class FactorialOfGivenNumber {
	public static void main(String[] args) {
		int x,factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integert:");
		x=sc.nextInt(); //6
		for(int i=1;i<=x;i++){ //1,2,3,4,5,6 7
			factorial=factorial*i;  //3*2=6*4=24*5=120*6=720
		}
		System.out.println(factorial);
	}

}
