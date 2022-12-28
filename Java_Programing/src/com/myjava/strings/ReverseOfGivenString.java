package com.myjava.strings;

import java.util.Scanner;

public class ReverseOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string:");
		String s=sc.next();
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
				

	}

}
