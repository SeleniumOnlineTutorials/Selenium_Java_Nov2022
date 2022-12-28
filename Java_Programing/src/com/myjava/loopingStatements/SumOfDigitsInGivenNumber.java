package com.myjava.loopingStatements;
import java.util.Scanner;;
public class SumOfDigitsInGivenNumber {
	
	public static void main(String[] args) {
		int x,sum=0,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		x=sc.nextInt();
		//2346
		while(x>0){
			y=x%10;
			sum=sum+y;
			x=x/10;
		}
		System.out.println(sum);
	}
}
