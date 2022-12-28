package com.myjava.loopingStatements;
import java.util.Scanner;
public class Loop {
	public static void main(String[] args) {
		int x, range; //declaration
		x=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the range of values to be printed:");
		range=sc.nextInt();
		while(x>0 && x<=range){
			System.out.print(x+ " ");
			x=x+1; //x++
		}
		System.out.println("end of while loop");
		
		while(true){
			
		}
	}

}
