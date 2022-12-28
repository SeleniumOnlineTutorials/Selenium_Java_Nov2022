package com.myjava.loopingStatements;
import java.util.Scanner;
public class EvenNumbers {
	
	public static void main(String[] args) {
		int x=1,range;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the range:");
		range=sc.nextInt();
		while(x>0 && x<=range){
			if(x%2!=0)
				System.out.print(x+" ");
			x++;
		}
	}

}
