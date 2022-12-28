package com.java.ArraysInJava;

public class SampleArray {
	
		int x[]={10,40,35,22,96,45};
		public static void main(String[] args) {
			SampleArray sa=new SampleArray();
			int len=sa.x.length; //size of an array
			System.out.println(len);
		// for loop can be used to retrive the data frm an array
			for(int i=0;i<=len-1;i++){
				System.out.println(sa.x[i]);
			}
			
		}
}
