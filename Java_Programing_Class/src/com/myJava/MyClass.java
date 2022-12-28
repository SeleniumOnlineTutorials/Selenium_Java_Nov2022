package com.myJava;

public class MyClass {

	public static void main(String[] args) {
		String str="This is Testing Tutorial Text";
		//How many T/t's having vowels beside them (a, e, i, o, u) - 5
		// Code to reverse each word in the string  - sihT si gnitseT lairotuT txeT
		String reverse="";
		String arr[]=str.split(" ");
		for(int i=0;i<=arr.length-1;i++){
			String s=arr[i];
			String temp="";
			for(int j=s.length()-1;j>=0;j--){
				temp=temp+s.charAt(j);
			}
			reverse=reverse+temp+" ";

		}
		System.out.println("reverse of given string:: "+reverse);


	}

}
