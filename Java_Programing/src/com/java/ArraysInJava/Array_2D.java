package com.java.ArraysInJava;

public class Array_2D {

	public static void main(String[] args) {
		int x[][]={{1,2,5},{3,3,4}};
		/*System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);*/
		
		int r=x.length; //number of rows
		System.out.println("rows "+r);
		/*int c=x[0].length; //number of columns
		System.out.println("coulmns "+c);*/
		
		//rows
		for(int i=0;i<r;i++){
			
			//columns
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
